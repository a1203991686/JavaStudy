package com.unit11.No06_UDP;

import java.io.IOException;
import java.net.*;

/**
 * 服务器端
 * Created by littlecorgi_a1203991686 on 2018/08/09 9:12.
 */
public class UDPServerDemo {

    public static void main(String[] args) {
        String info = "good good study, 天天 up";
        byte[] bytes = info.getBytes();
        try {
            // 封装一个数据报包
            /*
             * buf - 数据包数据
             * offset - 分组数据偏移量
             * length - 分组数据长度
             * address - 目的地址
             * port - 目的端口号
             */
            DatagramPacket dp = new DatagramPacket(bytes, 0, bytes.length, InetAddress.getByName("127.0.0.1"), 8000);
            // 本程序的端口号
            DatagramSocket socket = new DatagramSocket(9000);
            socket.send(dp);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
