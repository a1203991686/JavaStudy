package com.littlecorgi.onetoone;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author littlecorgi_a1203991686@126.com
 * @date 2018/08/14
 */
public class Server {

    public static void main(String[] args) {
        Vector<UserThread> vector = new Vector<>();
        ExecutorService es = Executors.newFixedThreadPool(5);
        try {
            ServerSocket ss = new ServerSocket(5419);
            System.out.println("服务器已启动...");
            while (true){
                Socket socket = ss.accept();
                UserThread userThread = new UserThread(socket, vector);
                es.execute(userThread);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class UserThread implements Runnable{
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

    @Override
    public void run() {
        try {
            System.out.println("客户端" + socket.getInetAddress().getHostAddress() + "已连接");
            oos = new ObjectOutputStream(socket.getOutputStream());
            ois = new ObjectInputStream(socket.getInputStream());

            while (flag){
                Message msg = ((Message) ois.readObject());

                int type = msg.getType();
                switch (type){
                    case MessageType.TYPE_LOGIN:
                        name = msg.getFrom();
                        msg.setInfo("欢迎登录");
                        oos.writeObject(msg);
                        msg.setInfo(name + " 已上线;当前线上 " + vector.size() + " 人");
                        for (UserThread userThread : vector) {
                        if (userThread != this){
                            userThread.oos.writeObject(msg);
                        }
                    }
                        break;
                    case MessageType.TYPE_SEND:
                        String to = msg.getTo();
                        for (UserThread aVector : vector) {
                            if (to.equals(aVector.name) && aVector != this) {
                                aVector.oos.writeObject(msg);
                                break;
                            }
                        }
                        break;
                    case MessageType.TYPE_EXIT:
                        flag = false;
                        break;
                    default:
                        break;
                }
            }
            ois.close();
            oos.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
