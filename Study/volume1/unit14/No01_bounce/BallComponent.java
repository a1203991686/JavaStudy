package com.volume1.unit14.No01_bounce;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * @author littlecorgi
 * @data 2018/08/10
 */
public class BallComponent extends JPanel {
    public static final int DEFAULT_WIDTH = 450;
    public static final int DEFAULT_HEIGHT = 350;

    private java.util.List<Ball> balls = new ArrayList<>();

    /**
     * Add a ball to the component
     * @param b the ball to add
     */
    public void add(Ball b){
        balls.add(b);
    }

    @Override
    protected void paintComponent(Graphics g) {
        // erase background
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (Ball b : balls){
            g2.fill(b.getShape());
        }
    }

    @Override
    public Dimension getPreferredSize(){
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
