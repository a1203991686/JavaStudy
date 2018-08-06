package com.day12.itcast_05;

/*
 * 字符串的特点：字符串是常量，一旦被赋值不能改变
 */

public class StringDemo {
    public static void main(String[] args) {
        String a = "hello";
        a += "world";
        System.out.println("a:" + a);
    }
}
