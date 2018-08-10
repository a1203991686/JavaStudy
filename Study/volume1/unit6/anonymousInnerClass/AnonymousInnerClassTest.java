/*
 * 与com.innerClass.InnerClassTest形成对应
 */
package com.volume1.unit6.anonymousInnerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * This program demonstrates anonymous inner classes
 * @version 1.11 2018-7-21
 * @author a1203
 */

public class AnonymousInnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock();
        clock.start(1000, true);

        // keep program running until user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

/**
 * A clock that prints the time in regular intervals
 */
class TalkingClock{
    /**
     * Starts the clock.
     * @param interval the interval between messages(in millseconds)
     * @param beep true if the clock should beep
     */
    public void start(int interval, boolean beep){
        ActionListener listener = new ActionListener(){
            public void actionPerformed(ActionEvent event){
                System.out.println("At the tone, the time is " + new Date());
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        };

        Timer t = new Timer(interval, listener);
        t.start();
    }
}
