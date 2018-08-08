package com.unit10.No09_DeadThread;

/**
 * 线程死锁：在同一个同步方法中调用了另一个对象的同步方法，可能产生死锁
 * Created by littlecorgi_a1203991686 on 2018/08/08 9:32.
 */
public class DeadThreadDemo {
    public static void main(String[] args) {
        new DeadThread();
    }
}

// 顾客
class Customer{
    public synchronized void say(Waiter w){
        System.out.println("顾客说：先吃饭再买单！！");
        w.doService();
    }

    public synchronized void doService(){
        System.out.println("同意了，买完单再吃饭");
    }
}

// 服务员
class Waiter{
    public synchronized void say(Customer c){
        System.out.println("服务员说：先买单再吃饭！");
        c.doService();
    }

    public synchronized void doService(){
        System.out.println("同意了，吃完饭再买单");
    }
}

class DeadThread implements Runnable{
    Customer c = new Customer();
    Waiter w = new Waiter();

    public DeadThread(){
        new Thread(this).start();
        w.say(c);
    }

    @Override
    public void run() {
        c.say(w);
    }
}
