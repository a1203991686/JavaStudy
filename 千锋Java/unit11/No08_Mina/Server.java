package com.unit11.No08_Mina;

import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.serialization.ObjectSerializationCodecFactory;
import org.apache.mina.transport.socket.SocketAcceptor;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * Created by littlecorgi_a1203991686 on 2018/08/09 10:27.
 */
public class Server {

    public static void main(String[] args) {
        // 创建一个非阻塞的Server端Socket NIO
        SocketAcceptor acceptor = new NioSocketAcceptor();
        DefaultIoFilterChainBuilder filterChain = acceptor.getFilterChain();
        // 设定一个过滤器，一行一行的读取数据(\r\n)
        // filterChain.addLast("myChin", new ProtocolCodecFilter(new TextLineCodecFactory()));
        // 设定过滤器以对象为单位来读取数据
        filterChain.addLast("ObjectFilter", new ProtocolCodecFilter(new ObjectSerializationCodecFactory()));
        // 设置服务器端的消息处理器
        acceptor.setHandler(new MinaServerHandle());
        int port = 9999; //服务器端口号
        try {
            // 绑定端口，启动服务器(不会阻塞，立即返回)
            acceptor.bind(new InetSocketAddress(port));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Mina Server running, listener on:" + port);

    }
}
