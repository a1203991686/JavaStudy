package com.littlecorgi.onetoone;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author littlecorgi_a1203991686@126.com
 * @date 2018/08/14
 */
public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ExecutorService es = Executors.newSingleThreadExecutor();
        try {
            /*
             * 初始化客户端
             */
            Socket socket = new Socket("127.0.0.1", 5419);
            System.out.println("服务器连接成功");
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            /*
             * 定义名称，服务器返回欢迎
             */
            System.out.println("请输入名字");
            String name = in.nextLine();
            Message msg = new Message(null, name, null, MessageType.TYPE_LOGIN);
            oos.writeObject(msg);
            msg = ((Message) ois.readObject());
            System.out.println(msg.getInfo());

            // 启动接收消息线程
            es.execute(new ClientThread(ois));

            // 主线程，用于发送消息
            boolean flag = true;
            while (flag){
                msg = new Message();
                System.out.println("to:");
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

class ClientThread implements Runnable{
    private ObjectInputStream ois;
    private boolean flag = true;

    public ClientThread(ObjectInputStream ois) {
        this.ois = ois;
    }

    @Override
    public void run() {
        try {
            while (flag){
                Message msg = ((Message) ois.readObject());
                if (msg.getType() == MessageType.TYPE_SEND){
                    System.out.println("[" + msg.getFrom() + "]对我说:" + msg.getInfo());
                }
                if (msg.getType() == MessageType.TYPE_LOGIN){
                    System.out.println(msg.getInfo());
                }
            }
            if (ois != null){
                ois.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
