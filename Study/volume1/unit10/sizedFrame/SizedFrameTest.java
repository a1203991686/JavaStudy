package com.volume1.unit10.sizedFrame;

import javax.swing.*;
import java.awt.*;

/**
 * @author littlecorgi_a1203991686@126.com on 2018/07/27 11:04
 */
public class SizedFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new SizedFrame();
            frame.setTitle("SizedFrame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class SizedFrame extends JFrame{
    public SizedFrame(){
        // get screen dimensions
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        // set frame width, height and let platform pick screen location

        setSize(screenWidth / 2, screenHeight / 2);
        setLocationByPlatform(true);

        // set frame icon
        Image img = new ImageIcon("icon.git").getImage();
        setIconImage(img);
    }
}