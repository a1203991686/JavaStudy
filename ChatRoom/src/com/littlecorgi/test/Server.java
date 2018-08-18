package com.littlecorgi.test;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static void main(String[] args) {
        Vector<UserThread> vector = new Vector<>();
        ExecutorService es = Executors.newFixedThreadPool(5);
        try {
            ServerSocket server = new ServerSocket(8888);
            System.out.println("服务器已启动，正在等待连接...");

            while(true){
                Socket socket = server.accept();
                System.out.println("客户端"+socket.getInetAddress().getHostAddress()+"已连接");
                UserThread userThread = new UserThread(socket,vector);
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
    public UserThread() {
    }

    public UserThread(Socket socket, Vector<UserThread> vector) {
        this.socket = socket;
        this.vector = vector;
        vector.add(this);
    }

    @Override
    public void run() {
        try {
            oos = new ObjectOutputStream(socket.getOutputStream());
            ois = new ObjectInputStream(socket.getInputStream());
            while(flag) {
                Message message = (Message) ois.readObject();
                System.out.println("来自" + message.getFrom() + "内容" + message.getInfo() + "类型" + message.getType());
                switch (message.getType()) {
                    case MessageType.TYPE_LOGIN:
                        name = message.getFrom();
                        oos.writeObject(new Message("","已上线，此时线上"+vector.size()+"人",MessageType.TYPE_LOGIN));
                        for(int i = 0;i<vector.size();i++){
                            UserThread ut = vector.get(i);
                            if(ut != this && ut.name != null ){
                                message.setInfo("已上线，此时线上"+vector.size()+"人");
                                ut.oos.writeObject(message);
                            }
                        }
                        break;
                    case MessageType.TYPE_SEND:
                        for (UserThread ut : vector) {
                            ut.oos.writeObject(message);
                        }
                        break;
                    case MessageType.TYPE_EXIT:
                        vector.remove(this);
                        for (UserThread ut : vector) {
                            message = new Message(name, "已下线,此时线上"+vector.size()+"人", MessageType.TYPE_EXIT);
                            ut.oos.writeObject(message);
                        }
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
