package com.day12.itcast_07;

/*
 * String获取功能
 *      int length():获取字符串长度
 *      char charAt(int index):获取指定索引位置的字符
 *      int indexOf(int ch):返回指定字符在字符串中出现的第一次索引
 *          为什么是int而不是char？
 *          原因是：'a'和97其实都可以代表a
 *      int indexOf(String str):返回指定字符串在字符串中出现的第一次索引
 *      int indexOf(int ch, int fromIndex):返回指定字符在字符串中从指定位置后出现的第一次索引
 *      int indexOf(String str, int fromIndex):返回指定字符串在字符串中从指定位置后出现的第一次索引
 *      String substring(int start):从指定位置开始截取字符串，默认到末尾
 *      String substring(int start, int end):从指定位置开始到指定位置结束截取字符串
 */

public class StringDemo {
    public static void main(String[] args) {
        String s = "helloworld";

        System.out.println("s.length():" + s.length());
        System.out.println("---------");
        System.out.println("charAt:" + s.charAt(7));
        System.out.println("---------");
        System.out.println("indexOf:" + s.indexOf('l'));
        System.out.println("---------");
        System.out.println("indexOf:" + s.indexOf("owo"));
        System.out.println("---------");
        System.out.println("indexOf:" + s.indexOf('l', 4));
        System.out.println("---------");
        System.out.println("indexOf:" + s.indexOf("ld",2));
        System.out.println("---------");
        System.out.println("substring:" + s.substring(5));
        System.out.println("---------");
        System.out.println("substring:" + s.substring(5,8));
        System.out.println("substring:" + s.substring(5,40)); //StringIndexOutOfBoundsException
        System.out.println("substring:" + s.substring(40,50)); //StringIndexOutOfBoundsException
        System.out.println("---------");
    }
}
