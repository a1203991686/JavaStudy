package com.day14.itcast_13;

/*
 * public BigInteger add(BigInteger val):加
 * public BigInteger subtract(BigInteger val):减
 * public BigInteger multiply(BigInteger val):乘
 * public BigInteger divide(BigInteger val):除
 * public BigInteger divideAndRemainder(BigInteger val):返回商和余数的数组
 */

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("100");
        BigInteger bi2 = new BigInteger("50");

        System.out.println("add:" + bi1.add(bi2));
        System.out.println("add:" + bi1.subtract(bi2));
        System.out.println("add:" + bi1.multiply(bi2));
        System.out.println("add:" + bi1.divide(bi2));

        BigInteger[] bis = bi1.divideAndRemainder(bi2);
        System.out.println("商:" + bis[0]);
        System.out.println("余数:" + bis[1]);
    }
}
