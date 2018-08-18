package com.littlecorgi.mutilchat;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author littlecorgi
 * @email a1203991686@126.com
 * @date 2018/08/14
 */
public class Client {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ExecutorService es = Executors.newSingleThreadExecutor();
        /*
         * 定义用户名
         */
        String name;

        try {
            System.out.println("请输入名字");
            name = in.nextLine();
            Socket socket = new Socket("222.24.34.34", 5419);
            System.out.println("服务器连接成功");
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Message msg = new Message(name, null, MessageType.TYPE_LOGIN);
            oos.writeObject(msg);

            es.execute(new ClientThread(ois));

            /*
             * 发送消息
             */
            boolean flag = true;
            while (flag){
                msg = new Message();
                String str = in.nextLine();
                String exit = "exit";
                String help = "-help";
                msg.setInfo(str);
                msg.setName(name);
                if (str.equals(exit)){
                    msg.setType(MessageType.TYPE_EXIT);
                    oos.writeObject(msg);
                    System.out.println("正在退出");
                    System.exit(0);
                } else if (str.equals(help)){
                    System.out.println("+-----------------------------+");
                    System.out.println("+-------------简介------------+");
                    System.out.println("+-此项目为一个简易的Java终端 -+");
                    System.out.println("+-        多人聊天室         -+");
                    System.out.println("+-------------帮助------------+");
                    System.out.println("+----输入 'exit' 即可退出-----+");
                    System.out.println("+-------------关于------------+");
                    System.out.println("+--powered by ： littlecorgi--+");
                    System.out.println("+-----------------------------+");
                } else {
                    msg.setType(MessageType.TYPE_SEND);
                    oos.writeObject(msg);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

/**
 * 接受消息线程
 */
class ClientThread implements Runnable{
    private ObjectInputStream ois;
    private boolean flag = true;

    public ClientThread(ObjectInputStream ois) {
        this.ois = ois;
    }

    @Override
    public void run() {
        try {
            while (flag) {
                Message msg = ((Message) ois.readObject());
                if (msg.getType() == MessageType.TYPE_LOGIN) {
                    System.out.println("[系统通知]" + msg.getInfo());
                } else if (msg.getType() == MessageType.TYPE_SEND) {
                    System.out.println("[" + msg.getName() + "]:" + msg.getInfo());
                } else if (msg.getType() == MessageType.TYPE_EXIT){
                    System.out.println("[系统通知]" + msg.getInfo());
                }
            }
            if (ois != null) {
                ois.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
