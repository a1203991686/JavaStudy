package com.day13.itcast_01;

/*
 * 线程安全(多线程讲解)：
 * 安全 -- 同步 -- 数据是安全的
 * 不安全 -- 不同步 -- 效率高
 * 安全和效率是永远困扰我们的问题
 * 安全：医院的网站，银行的网站
 * 效率：新闻性的网站，论坛子类的
 *
 * StringBuffer:
 *      线程安全的可变字符串
 * StringBuffer和String的区别
 * 前者长度和内容都可变，后者不可变
 * 如果使用前者作字符串拼接，不会浪费太多空间
 *
 * StringBuffer的构造方法
 *      public StringBuffer():无参构造 初始容量为16
 *      public StringBuffer(int capacity):指定容量的字符串缓冲区对象
 *      public StringBuffer(String str):指定字符串内容的字符串缓冲区对象
 *
 * StringBuffer的方法
 *      public int capacity():返回当前容量（理论）
 *      public int length():返回字符串长度（实际）
 */

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("sb:" + sb); //重写了toString
        System.out.println("sb.capacity():" + sb.capacity());
        System.out.println("sb.length():" + sb.length());
        System.out.println("---------------------");

        StringBuffer sb2 = new StringBuffer(50);
        System.out.println("sb2:" + sb2); //重写了toString
        System.out.println("sb2.capacity():" + sb2.capacity());
        System.out.println("sb2.length():" + sb2.length());
        System.out.println("---------------------");

        StringBuffer sb3 = new StringBuffer("hello");
        System.out.println("sb3:" + sb3); //重写了toString
        System.out.println("sb3.capacity():" + sb3.capacity()); //16 + 5 = 21;
        System.out.println("sb3.length():" + sb3.length());
        System.out.println("---------------------");
    }
}
