package com.day12.itcast_06;

/*
 * 判断功能
 *      boolean equals(Object obj):比较字符串内容是否相同，区分大小写
 *      boolean equalsIgnoreCase(String str):比较字符串内容是否相同，忽略大小写
 *      boolean contains(String str):判断大串中是否包含小串
 *      boolean startsWith(String str):判断字符串是否以某个指定的字符串开头
 *      boolean endWith(String str):判断字符串是否以某个指定的字符串结尾
 *      boolean isEmpty():判断字符串是否为空
 *
 * 注意：
 *      字符串内容为空和对象为空
 *      String s = "";
 *      String s = null;
 */

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "helloworld";
        String s2 = "helloworld";
        String s3 = "Helloworld";

        System.out.println("equals:" + s1.equals(s2)); //true
        System.out.println("equals:" + s1.equals(s3)); //false
        System.out.println("------------");
        System.out.println("equalsIgnoreCase:" + s1.equalsIgnoreCase(s2)); //true
        System.out.println("equalsIgnoreCase:" + s1.equalsIgnoreCase(s3)); //true
        System.out.println("------------");
        System.out.println("contains:" + s1.contains("hello")); //true
        System.out.println("contains:" + s1.contains("hw")); //false
        System.out.println("------------");
        System.out.println("startsWith:" + s1.startsWith("h")); //true
        System.out.println("startsWith:" + s1.startsWith("hello")); //true
        System.out.println("startsWith:" + s1.startsWith("world")); //false
        System.out.println("------------");
        System.out.println("isEmpty:" + s1.isEmpty()); //false
        String s4 = "";
        String s5 = null;
        System.out.println("isEmpty:" + s4.isEmpty()); //true
        System.out.println("isEmpty:" + s5.isEmpty()); //java.lang.NullPointerException
        //s5对象不存在，所以不能调用方法，空指针异常
    }
}
