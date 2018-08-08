package com.unit10.No06_Thread;

/**
 * Created by littlecorgi_a1203991686 on 2018/08/07 20:42.
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        MyRunnable4 mr4 = new MyRunnable4();
        Thread t = new Thread(mr4);
        // 线程可以分成守护线程和用户线程，当进程中没有用户时，JVM会退出，
        t.setDaemon(true); //把线程设置为守护线程
        t.start();

        for (int i = 0; i < 50; i++) {
            System.out.println("main--" + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 5){
                Thread.yield(); //让出本次CPU执行时间片
            }
        }

    }
}

class MyRunnable4 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("--" + i);
        }
    }
}
