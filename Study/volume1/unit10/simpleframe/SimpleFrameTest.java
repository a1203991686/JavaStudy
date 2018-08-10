package com.volume1.unit10.simpleframe;

import javax.swing.*;
import java.awt.*;

/**
 * @author littlecorgi_a1203991686@126.com on 2018/07/27 10:29
 */
public class SimpleFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            SimpleFrame frame = new SimpleFrame();
            frame.setResizable(true);
            frame.setTitle("hello world");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class SimpleFrame extends JFrame{
    Toolkit kit = Toolkit.getDefaultToolkit();
    Dimension screenSize = kit.getScreenSize();
    int screenWidth = screenSize.width / 2;
    int screenHeight = screenSize.height / 2;

    public SimpleFrame(){
        setSize(screenWidth,screenHeight);
    }
}
