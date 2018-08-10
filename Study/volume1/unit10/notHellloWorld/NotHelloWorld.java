package com.volume1.unit10.notHellloWorld;

import javax.swing.*;
import java.awt.*;

/**
 * @author littlecorgi_a1203991686@126.com on 2018/07/27 11:15
 */
public class NotHelloWorld {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new NotHelloWorldFrame();
            frame.setTitle("NotHelloWorld");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

/**
 * A frame that contains a message panel
 */
class NotHelloWorldFrame extends JFrame{
    public NotHelloWorldFrame(){
        add(new NotHelloWorldComponent());
        pack();
    }
}

/**
 * A component that displays a message
 */
 class NotHelloWorldComponent extends JComponent{
     public static final int MESSAGE_X = 75;
     public static final int MESSAGE_Y = 100;

     private static final int DEFAULT_WIDTH = 300;
     private static final int DEFAULT_HEIGHT = 200;

     public void paintComponent(Graphics g) {
         g.drawString("Not a Hello, World program", MESSAGE_X, MESSAGE_Y);
     }

     public Dimension getPreferredSize(){
         return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
     }
}

