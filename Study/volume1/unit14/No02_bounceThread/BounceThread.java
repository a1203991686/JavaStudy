package com.volume1.unit14.No02_bounceThread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * @author littlecorgi
 * @data 2018/08/10
 */
public class BounceThread {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new BounceFrame();
            frame.setTitle("BounceThread");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class BounceFrame extends JFrame{
    private BallComponent comp;
    public static final int STEPS = 1000;
    public static final int DELAY = 5;

    public BounceFrame(){
        comp = new BallComponent();
        add(comp, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        addButton(buttonPanel, "Start", event -> addBall());
        addButton(buttonPanel, "Close", event -> System.exit(0));
        add(buttonPanel, BorderLayout.SOUTH);
        pack();
    }

    private void addBall() {
        Ball ball = new Ball();
        comp.add(ball);
        Runnable r = () -> {
            try {
                for (int i = 0; i < STEPS; i++) {
                    ball.move(comp.getBounds());
                    comp.repaint();
                    Thread.sleep(DELAY);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread t = new Thread(r);
        t.start();
    }

    public void addButton(Container c, String title, ActionListener listener){
        JButton button = new JButton(title);
        c.add(button);
        button.addActionListener(listener);
    }
}
