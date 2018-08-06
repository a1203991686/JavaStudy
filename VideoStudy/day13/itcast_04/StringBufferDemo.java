package com.day13.itcast_04;

/*
 * StringBuffer替换功能
 *      public StringBuffer replace(int start, int end, String str):从start开始到end结束用str替换
 */

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("hello").append("world").append("java");
        System.out.println("sb:" + sb);

        //把world换为节日快乐
        sb.replace(5,10,"节日快乐");
        System.out.println("sb:" + sb);
    }
}
