package com.unit10.No05_ThreadDemo;

/**
 * join方法：
 *  加入线程，让调用的线程先执行指定时间或执行完毕，再执行其他线程
 *  终端线程：
 *      （1） 使用Interrupted方法来终端线程，设置一个中断状态（标记）
 *      （2） 自定义标记的方式（推荐使用）
 * Created by littlecorgi_a1203991686 on 2018/08/07 20:09.
 */
public class ThreadDemo {
    public static void main(String[] args) {

        MyRunnable2 mr2 = new MyRunnable2();
        Thread t = new Thread(mr2);
        // t.start();

        MyRunnable3 mr3 = new MyRunnable3();
        Thread t2 = new Thread(mr3);
        t2.start();

        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + "--" + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 20){
                // try {
                //     t.join(); //让t线程执行完毕
                // } catch (InterruptedException e) {
                //     e.printStackTrace();
                // }
                // t.interrupt(); //中断线程
                mr3.flag = false;
            }
        }
    }
}

class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (Thread.interrupted()){ //测试终端状态，此方法会把中断状态清除

            }
            System.out.println(Thread.currentThread().getName() + "--" + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyRunnable3 implements Runnable{
    public boolean flag = true;

    public MyRunnable3() {
        super();
    }

    @Override
    public void run() {
        int i = 0;
        while (flag){
            System.out.println(Thread.currentThread().getName() + "===" + (i++));
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
