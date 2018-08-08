package com.unit10.No10_ProducterCustomer;

/**
 * 两个线程协同工作，先生产再消费
 *
 * 面试题：
 *  sleep 与 wait 的区别
 *  sleep：让线程进入休眠状态，让出CPU的时间片，不释放对象监视器的所有权（对象锁）
 *  wait：让线程进入等待状态，让出CPU的时间片，并释放对象监视器的所有权（对象锁），等待其他线程通过notify方法来唤醒
 *
 * Created by littlecorgi_a1203991686 on 2018/08/08 9:55.
 */
public class ProducerCustomerDemo {
    public static void main(String[] args) {
        Food food = new Food();
        Producter p = new Producter(food);
        Customer c = new Customer(food);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();
    }
}

/**
 * 消费者
 */
class Customer implements Runnable{
    private Food food;

    public Customer(Food food){
        this.food = food;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            food.get();
        }
    }
}

/**
 * 生产者
 */
class Producter implements Runnable{
    private Food food;

    public Producter(Food food){
        this.food = food;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0){
                food.set("锅包肉", "酸甜口味，爽");
            } else {
                food.set("佛跳墙", "大补，滋阴补阳");
            }
        }
    }
}

/**
 * 食物
 */
class Food{
    private String name;
    private String desc;
    private boolean flag = false; //true表示可以生产，false表示可以消费

    /**
     * 生产产品
     * @param name 食物名称
     * @param desc 食物描述
     */
    public synchronized void set(String name, String desc){
        // 不能生产
        if (flag){
            try {
                this.wait(); //线程进入等待状态，释放监视器的所有权（对象锁）
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setName(name);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setDesc(desc);
        flag = true;
        this.notify(); //唤醒等待的线程（随机其中一个）
    }

    /**
     * 消费产品
     */
    public synchronized void get(){
        // 不能消费
        if (!flag){
            try {
                this.wait(); //线程进入等待状态，释放监视器的所有权（对象锁）
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getName() + "->" + this.getDesc());
        flag = false;
        this.notify(); //唤醒等待的线程（随机其中一个）
    }

    public Food(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public Food() {
        super();
    }
}
