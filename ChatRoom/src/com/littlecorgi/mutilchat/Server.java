package com.littlecorgi.mutilchat;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author littlecorgi
 * @email a1203991686@126.com
 * @date 2018/08/14
 */

public class Server {
    public static void main(String[] args) {
        Vector<UserThread> vector = new Vector<>();
        ExecutorService es = Executors.newFixedThreadPool(5);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Scanner in = new Scanner(System.in);

        try {
            ServerSocket ss = new ServerSocket(5419);
            System.out.println("服务器已启动...");
            Initialize initialize = new Initialize(vector, es, ss);
            executorService.execute(initialize);

            while (true){
                String a = "exit";
                String str = in.nextLine();
                if (a.equals(str)){
                    if (vector.size() != 0){
                        System.out.println("此时服务器中还有" + vector.size() + "人");
                    } else {
                        System.out.println("正在关闭服务器，请稍后...");
                        Thread.sleep(500);
                        System.exit(0);
                    }
                }
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class UserThread implements Runnable{
    private int type;
    private String name;
    private Socket socket;
    private Vector<UserThread> vector;
    private ObjectInputStream ois;
    private ObjectOutputStream oos;
    private boolean flag = true;

    public UserThread(Socket socket, Vector<UserThread> vector) {
        this.socket = socket;
        this.vector = vector;
        vector.add(this);
    }

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }

    @Override
    public void run() {
        try {
            System.out.println("客户端" + socket.getInetAddress().getHostAddress() + "已连接");
            oos = new ObjectOutputStream(socket.getOutputStream());
            ois = new ObjectInputStream(socket.getInputStream());

            while (flag){
                Message msg = (Message) ois.readObject();
                System.out.println("来自[" + msg.getName() + "],内容\"" + msg.getInfo() + "\",类型" + msg.getType());
                type = msg.getType();
                switch (type){
                    case MessageType.TYPE_LOGIN:
                        /*
                         * 对用户发消息
                         */
                        name = msg.getName();
                        msg.setInfo("欢迎登录，输入'-help'获取帮助信息");
                        oos.writeObject(msg);
                        if (vector.size() != 1){
                            StringBuilder stringBuilder = new StringBuilder();
                            for (UserThread userThread : vector) {
                                if (userThread != this && userThread.name != null){
                                    stringBuilder.append(userThread.name).append(", ");
                                }
                            }
                            Message message = new Message();
                            message.setName(name);
                            message.setInfo("此时服务器中有" + stringBuilder.toString());
                            message.setType(MessageType.TYPE_LOGIN);
                            oos.writeObject(message);
                        }
                        /*
                         * 对其他用户发送信息
                         */
                        msg.setInfo(name + " 已登录，此时有 " + vector.size() + " 人");
                        for (UserThread userThread : vector) {
                            if (userThread != this && userThread.name != null){
                                userThread.oos.writeObject(msg);
                            }
                        }
                        break;
                    case MessageType.TYPE_SEND:
                        /*
                         * 为每个用户传输信息
                         */
                        for (UserThread userThread : vector) {
                            userThread.oos.writeObject(msg);
                        }
                        break;
                    case MessageType.TYPE_EXIT:
                        for (UserThread userThread : vector) {
                            if (userThread.name.equals(name)){
                                vector.remove(userThread);
                                break;
                            }
                        }
                        msg.setInfo(name + " 已退出，此时有 " + vector.size() + " 人");
                        for (UserThread userThread : vector) {
                            userThread.oos.writeObject(msg);
                        }
                        break;
                    default:
                        break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Initialize implements Runnable{
    private Vector<UserThread> vector;
    private ExecutorService es;
    private ServerSocket ss;

    public Initialize(Vector<UserThread> vector, ExecutorService es, ServerSocket ss) {
        this.vector = vector;
        this.es = es;
        this.ss = ss;
    }

    @Override
    public void run() {
        while (true){
            try {
                Socket socket = ss.accept();
                UserThread userThread = new UserThread(socket, vector);
                es.execute(userThread);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
