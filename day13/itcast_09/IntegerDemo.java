package com.day13.itcast_09;

/*
 * 需求1：把100这个数据的二进制、八进制、十六进制计算出来
 * 需求2：判断一个数据是否为int范围内的
 *        首先的知道int的范围？
 *
 * 为了对基本数据进行更多的操作，更方便的操作,Java就针对每一种基本类型提供了对应的类类型，称为包装类类型
 * byte     Byte
 * short    Short
 * int      Integer
 * long     Long
 * float    Float
 * double   Double
 * char     Character
 * boolean  Boolean
 *
 * 用于基本数据类型与字符串之间的转换
 */

public class IntegerDemo {
    public static void main(String[] args) {
        System.out.println("2进制:" + Integer.toBinaryString(100));
        System.out.println("8进制:" + Integer.toOctalString(100));
        System.out.println("16进制:" + Integer.toHexString(100));

        System.out.println("int最大值:" + Integer.MAX_VALUE);
        System.out.println("int最小值:" + Integer.MIN_VALUE);
    }
}
