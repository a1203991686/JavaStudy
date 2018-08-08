package com.unit11.No02_EchoServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by littlecorgi_a1203991686 on 2018/08/08 16:51.
 */
public class EchoServerDemo {
    public static void main(String[] args) {
        // 创建一个服务器端的Socket（1024-65535）
        try {
            ServerSocket serverSocket = new ServerSocket(6666);
            System.out.println("服务器已启动，正在等待客户端连接...");
            // 等待客户端的连接，造成阻塞，如果有客户端连接成功，立即返回一个Socket对象
            Socket socket = serverSocket.accept();
            System.out.println("连接成功！");
            BufferedReader br = new BufferedReader(new InputStreamReader( socket.getInputStream()));
            // 通过输入流来读取网络数据,如果没有数据，那么会阻塞
            String info = br.readLine();
            System.out.println(info);
            // 获取输出流，向客户端返回消息
            PrintStream ps = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
            ps.println("echo:" + info);
            ps.flush();
            // 关闭流
            ps.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
