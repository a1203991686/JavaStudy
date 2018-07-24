package com.day14.itcast_16;

/*
 * Date类
 *
 * 构造方法
 *      Date():根据当前的默认毫秒值创建日期对象
 *      Date(long date):根据给定的毫秒值创建日期对象
 */

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println("d1:" + d1);

        long time = 1000 * 60 * 60; //1小时
        Date d2 = new Date(time);
        System.out.println("d2:" + d2);
    }
}
