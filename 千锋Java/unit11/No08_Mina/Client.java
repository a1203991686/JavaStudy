package com.unit11.No08_Mina;

import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.serialization.ObjectSerializationCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

import java.net.InetSocketAddress;
import java.util.Scanner;

/**
 * Created by littlecorgi_a1203991686 on 2018/08/09 12:02.
 */
public class Client {
    public static void main(String[] args) {

        // 创建NIO连接
        NioSocketConnector connector = new NioSocketConnector();
        DefaultIoFilterChainBuilder chain = connector.getFilterChain();
        // chain.addLast("MyChin", new ProtocolCodecFilter(new TextLineCodecFactory()));
        chain.addLast("ObjectFilter", new ProtocolCodecFilter(new ObjectSerializationCodecFactory()));

        connector.setHandler(new MinaClientHandle());
        connector.setConnectTimeoutMillis(10000);
        // 连接服务器
        ConnectFuture cf = connector.connect(new InetSocketAddress("localhost", 9999));
        cf.awaitUninterruptibly(); //等待连接成功
        Scanner in = new Scanner(System.in);

        while (true) {
            // System.out.println("请输入:");
            // String s = in.nextLine();
            // // 发送消息
            // cf.getSession().write(s);

            // 以对象的方式传输数据
            Message msg = new Message();
            System.out.println("from:");
            msg.setFrom(in.nextLine());
            System.out.println("to:");
            msg.setTo(in.nextLine());
            System.out.println("info:");
            msg.setInfo(in.nextLine());
            msg.setType("send");
            cf.getSession().write(msg);
        }

        // 等待服务器连接关闭，结束长连接
        // cf.getSession().getCloseFuture().awaitUninterruptibly();
        // 关闭连接
        // connector.dispose();
    }
}
