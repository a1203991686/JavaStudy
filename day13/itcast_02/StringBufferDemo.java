package com.day13.itcast_02;

/*
 * StringBuffer的添加
 *      public StringBuffer append(String str):可以把任意类型添加到字符串缓冲区里面,并返回字符串缓冲区本身
 *      public StringBuffer insert(int offset, String str):在指定位置吧任意类型数据插入到字符串缓冲区，返回字符串缓冲区本身
 */

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

//        StringBuffer sb2 = sb.append("hello");
//        System.out.println("sb:" + sb);
//        System.out.println("sb2:" + sb2);
//        System.out.println(sb == sb2); //true

//        一步一步添加数据
//        sb.append("hello");
//        sb.append(true);
//        sb.append(12);
//        sb.append(34.56f);
//        hellotrue1234.56

        //链式编程
        sb.append("hello").append(true).append(12).append(34.56); //hellotrue1234.56
        System.out.println("sb:" + sb);

        sb.insert(5,"world");
        System.out.println("sb:" + sb); //helloworldtrue1234.56


    }
}
