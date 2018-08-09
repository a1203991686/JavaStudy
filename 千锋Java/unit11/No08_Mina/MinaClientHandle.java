package com.unit11.No08_Mina;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;

/**
 * Created by littlecorgi_a1203991686 on 2018/08/09 12:02.
 */
public class MinaClientHandle extends IoHandlerAdapter {
    @Override
    public void sessionOpened(IoSession session) throws Exception {
        super.sessionOpened(session);
        System.out.println("sessionOpened");
    }

    @Override
    public void sessionClosed(IoSession session) throws Exception {
        super.sessionClosed(session);
        System.out.println("sessionClosed");
    }

    @Override
    public void messageReceived(IoSession session, Object message) throws Exception {
        super.messageReceived(session, message);
        // String msg = (String) message;
        Message msg = (Message)message;
        System.out.println(msg);
    }
}
