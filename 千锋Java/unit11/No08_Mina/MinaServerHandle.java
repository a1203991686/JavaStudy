package com.unit11.No08_Mina;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;

/**
 * 服务器的消息处理器
 * Created by littlecorgi_a1203991686 on 2018/08/09 10:31.
 */
public class MinaServerHandle extends IoHandlerAdapter {
    // 一次会话被打开
    @Override
    public void sessionOpened(IoSession session) throws Exception {
        super.sessionOpened(session);
        System.out.println("welcome client " + session.getRemoteAddress());
    }

    // 会话关闭
    @Override
    public void sessionClosed(IoSession session) throws Exception {
        super.sessionClosed(session);
        System.out.println("client close");
    }

    // 接收消息
    @Override
    public void messageReceived(IoSession session, Object message) throws Exception {
        super.messageReceived(session, message);
        // String msg = (String) message; //接收到的消息对象
        Message msg = (Message)message;
        System.out.println("收到客户端发来的消息：" + msg);
        msg.setInfo("好吃的");
        // 向客户端发送消息对象
        session.write(msg);
    }
}
