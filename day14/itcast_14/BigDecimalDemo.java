package com.day14.itcast_14;

/*
 * 由于在运算的时候，float和double很容易丢失精度(这是由于浮点存储数据与整数不一样)，那么java引入了BigDecimal。
 */

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        System.out.println(0.09 + 0.01); //0.09999999999999999
        System.out.println(1.0 - 0.32); //0.6799999999999999
        System.out.println(1.015 * 100); //101.49999999999999
        System.out.println(1.301 / 100); //0.013009999999999999

        System.out.println(1.0 - 0.12); //0.88
    }
}
