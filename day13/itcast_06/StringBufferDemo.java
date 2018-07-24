package com.day13.itcast_06;

/*
 * StringBuffer截取功能:注意返回类型不再是StringBuffer本身
 *      public String substring(int start)
 *      public String substring(int start, int end)
 */

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("hello").append("world").append("java");

        String str = sb.substring(5);
        System.out.println("str:" + str); //worldjava
        System.out.println("sb:" + sb); //helloworldjava

        String ss = sb.substring(5,10);
        System.out.println("ss:" + ss); //hellojava
        System.out.println("sb:" + sb); //helloworldjava
    }
}
