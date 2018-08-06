package com.day13.itcast_05;

/*
 * String Buffer反转功能
 *      public StringBuffer reverse()
 */

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("谋楼雷丢");
        System.out.println("sb:" + sb);

        sb.reverse();
        System.out.println("sb:" + sb);
    }
}
