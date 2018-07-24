package com.day14.itcast_12;

/*
 * BigInteger:可以让超过Integer范围内的数据进行运算
 * 构造方法
 *      BugInteger(String val)
 *
 */

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        System.out.println(i);

//        System.out.println(Integer.MAX_VALUE);
        Integer ii = new Integer(2147483647);
        System.out.println(ii);

//        Integer iii = new Integer(2147483648);
//        System.out.println(iii); //过大的整数: 2147483648

        BigInteger bi = new BigInteger("2147483648");
        System.out.println("bi:" + bi);

    }
}
