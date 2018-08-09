package com.unit11.No06_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 客户端
 * Created by littlecorgi_a1203991686 on 2018/08/09 9:24.
 */
public class UDPClientDemo {

    public static void main(String[] args) {
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        try {
            DatagramSocket socket = new DatagramSocket(8000);
            System.out.println("正在接收数据...");
            socket.receive(dp); //接收数据
            String s = new String(dp.getData(), 0, dp.getLength());
            System.out.println(s);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
