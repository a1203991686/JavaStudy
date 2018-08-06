package com.day13.itcast_12;

/*
 * 常见的基本类型转换
 *      public static String toBinaryString(int i)
 *      public static String toOctalString(int i)
 *      public static String toHesString(int i)
 * 十进制到其他进制
 *      public static String toString(int i, int radix);
 *      由这个我们也看到了进制的范围:2-36
 *      为什么？0,...9,a,...z总共36个
 * 其他进制到十进制
 *      public static int pareInt(int i, int radix)
 */

public class IntegerDemo {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(100));
        System.out.println(Integer.toOctalString(100));
        System.out.println(Integer.toHexString(100));
        System.out.println("--------------");

        System.out.println(Integer.toString(100, 10));
        System.out.println(Integer.toString(100, 2));
        System.out.println(Integer.toString(100, 8));
        System.out.println(Integer.toString(100, 10));
        System.out.println(Integer.toString(100, 5));
        System.out.println(Integer.toString(100, 7));
        System.out.println(Integer.toString(100, -7));
        System.out.println(Integer.toString(100, 70));
        System.out.println(Integer.toString(100, 1));
        System.out.println(Integer.toString(100, 17));
        System.out.println(Integer.toString(100, 32));
        System.out.println(Integer.toString(100, 37));
        System.out.println(Integer.toString(100, 36));
        System.out.println("--------------");

        System.out.println(Integer.parseInt("100",10));
        System.out.println(Integer.parseInt("100",2));
        System.out.println(Integer.parseInt("100",8));
        System.out.println(Integer.parseInt("100",16));
        System.out.println(Integer.parseInt("4f",16));
        //NumberFormatException
        //System.out.println(Integer.parseInt("123",2));
    }
}
