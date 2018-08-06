package com.day13.itcast_13;

/*
 * JDK5的新特性
 * 自动装箱：把基本类型转换为包装类类型
 * 自动拆箱：把包装类类型转换为基本类型
 *
 * 注意一个小问题
 *      在使用时，Integer x = null;代码会出现NullPointerException
 *      建议先判断是否为null，再使用
 */

public class IntegerDemo {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        Integer ii = 100;
        ii += 200;

        Integer iii =null;
        if (iii != null) {
            iii += 1000;
            System.out.println(iii); //NullPointerException
        }
    }
}
