package com.unit11.No04_communication;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by littlecorgi_a1203991686 on 2018/08/08 19:30.
 */
public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ExecutorService es = Executors.newSingleThreadExecutor();
        try {
            Socket socket = new Socket("localhost", 8888);
            System.out.println("服务器连接成功");
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            // 向服务器发送登陆信息
            System.out.println("请输入名称");
            String name = in.nextLine();
            Message msg = new Message(name, null, MessageType.TYPE_LOGIN, null);
            oos.writeObject(msg);
            msg = (Message) ois.readObject();
            System.out.println(msg.getInfo() + msg.getFrom());
            // 启动读取消息的线程
            es.execute(new ReadInfoThreed(ois));

            // 使用主线程来实现发送消息
            boolean flag = true;
            while (flag){
                msg = new Message();
                System.out.println("To:");
                msg.setTo(in.nextLine());
                msg.setFrom(name);
                msg.setType(MessageType.TYPE_SEND);
                System.out.println("Info:");
                msg.setInfo(in.nextLine());
                oos.writeObject(msg);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

// 读取消息
class ReadInfoThreed implements Runnable{
    private ObjectInputStream in;
    private boolean flag = true;

    public ReadInfoThreed(ObjectInputStream in) {
        this.in = in;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        try {
            while (flag){
                Message message = (Message) in.readObject();
                System.out.println("[" + message.getFrom() + "]对我说:" + message.getInfo());
            }
            if (in != null){
                in.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
