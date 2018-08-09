package com.unit11.No03_MutilServerDemo;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by littlecorgi_a1203991686 on 2018/08/08 17:00.
 */
public class MutilClientDemo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // 创建一个Socket对象,指定要连接的服务器
        try {
            Socket socket = new Socket("127.0.0.1", 6666);
            // 获取Socket的输入输出流
            PrintStream ps = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("请输入");
            String info = in.nextLine();
            ps.println(info);
            ps.flush();
            // 读取服务器端返回的数据
            info = br.readLine();
            System.out.println(info);
            ps.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        in.close();
    }
}
