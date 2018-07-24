package com.day12.itcast_05;

public class StringDemo4 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        System.out.println(s3 == s1 + s2); //false s1+s2先开空间在拼接，这个时候s1和s2以及拼接最后的地址都不同
        System.out.println(s3.equals((s1 + s2))); //true
        System.out.println(s3 == "hello" + "world"); //false 这个错了，应该是true 这两个常量相加，直接加常量值再来看一模一样相同的
        System.out.println(s3.equals("hello" + "world")); //true
    }
}
