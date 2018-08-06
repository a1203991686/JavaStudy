package com.day13.itcast_03;

/*
 * StringBuffer删除功能
 *      public StringBuffer deleteCharAt(int index):删除指定位置的字符，并返回本身
 *      public StringBuffer delete(int start, int end):删除从指定位置开始，到指定位置结束的内容，并返回本身
 */

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("hello").append("world").append("java");
        System.out.println("Sb:" + sb); //helloworldjava

//        sb.deleteCharAt(1);
//        System.out.println("Sb:" + sb); //hlloworldjava
//
//        sb.deleteCharAt(1);
//        System.out.println("Sb:" + sb); //hloworldjava

//        sb.delete(1,5); //hworldjava(包左不包右)
//        System.out.println("Sb:" + sb);

        sb.delete(0,sb.length());
        System.out.println("Sb:" + sb);
    }
}
