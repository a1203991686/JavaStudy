package com.day14.itcast_15;

/*
 * public BigDecimal add(BigDecimal augend)
 * public BigDecimal subtract(BigDecimal subtrahend)
 * public BigDecimal multiply(BigDecimal multiplicand)
 * public BigDecimal divide(BigDecimal divisor)
 * public BigDecimal divide(BigDecimal divisor, int scale, int roundingMode):商，几位小数，如何舍取
 */

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
//        System.out.println(0.09 + 0.01); //0.09999999999999999
//        System.out.println(1.0 - 0.32); //0.6799999999999999
//        System.out.println(1.015 * 100); //101.49999999999999
//        System.out.println(1.301 / 100); //0.013009999999999999
        BigDecimal bd1 = new BigDecimal("0.09");
        BigDecimal bd2 = new BigDecimal("0.01");
        System.out.println(bd1.add(bd2)); //0.10

        BigDecimal bd3 = new BigDecimal("1.0");
        BigDecimal bd4 = new BigDecimal("0.32");
        System.out.println(bd3.subtract(bd4)); //0.68

        BigDecimal bd5 = new BigDecimal("1.015");
        BigDecimal bd6 = new BigDecimal("100");
        System.out.println(bd5.multiply(bd6)); //101.500

        BigDecimal bd7 = new BigDecimal("1.301");
        BigDecimal bd8 = new BigDecimal("100");
        System.out.println(bd7.divide(bd8)); //0.01301
        System.out.println(bd7.divide(bd8, 3, BigDecimal.ROUND_HALF_UP)); //0.013
    }
}
