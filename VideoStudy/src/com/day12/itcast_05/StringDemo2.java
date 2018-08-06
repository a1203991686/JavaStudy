package com.day12.itcast_05;

/*
 * String s = new String("Hello")与String s = "Hello"的区别
 * 前者创建2个或者1个对象，后者创建1个或者0个 对象
 * 前者管理了管理"Hello"的地方。后者直接对"Hello"进行管理
 *
 * ==:比较引用类型的是地址值是否相同
 * equals:比较引用类型默认是地址值是否相同，而String类重写了equals()
 */

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = "Hello";

        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //true
    }
}
