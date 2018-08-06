package com.unit09.queuedemo;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Queue接口：队列，是一种先进先出的线性数据结构（排队）
 * LinkedList类实现了Queue接口
 * 请求队列，消息队列
 *
 * Deque接口：双端队列
 * Stack：堆栈：先进后出
 * @author littlecorgi_a1203991686@126.com on 2018/07/26 16:17
 */
public class QueueTest {
    private static void stack(){
        Stack s = new Stack();
        s.push("Bin");
        s.push("Tom");
        s.push("Lily");
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }

    private static void deque(){
        Deque<String> deque = new LinkedList<>();
        deque.add("小花");
        deque.add("小黑");
        deque.add("小小");
        deque.add("小白");
        deque.add("小丽");

        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
    }

    private static void queue(){
        Queue<String> queue = new LinkedList<>();
        queue.add("小花");
        queue.add("小黑");
        queue.add("小小");
        queue.add("小白");
        queue.add("小丽");

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());
    }

    public static void main(String[] args) {
        // queue();
        // deque();
        stack();
    }
}
