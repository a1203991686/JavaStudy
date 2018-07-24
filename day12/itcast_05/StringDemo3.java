package com.day12.itcast_05;

public class StringDemo3 {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //true

        String s3 = new String("Hello");
        String s4 = "Hello";
        System.out.println(s3 == s4); //false
        System.out.println(s3.equals(s4)); //true

        String s5 = "Hello";
        String s6 = "Hello";
        System.out.println(s5 == s6); //true
        System.out.println(s5.equals(s6)); //true
    }
}
