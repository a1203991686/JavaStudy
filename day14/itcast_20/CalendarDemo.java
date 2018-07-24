package com.day14.itcast_20;

/*
 * Calendar 类是一个抽象类，它为特定瞬间与一组诸如YEAR、MONTH、DAY_OF_MONTH、HOUR等日历字段之间的转换提供了一些方法，
 *      并为操作日历字段（例如获得下星期的日期）提供了一些方法。瞬间可用毫秒值来表示，它是距历元(即1970年1月1日的00:00:00.000)的偏移量。
 *
 * public int get(int field):返回给定日历字段的值。日历类中的而每个日历字段都是静态的成员变量，并且是int型的
 */

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar rightnow = Calendar.getInstance();

        int year = rightnow.get(Calendar.YEAR);
        int month = rightnow.get(Calendar.MONTH);
        int date = rightnow.get(Calendar.DATE);

        System.out.println(year + "年" + (month + 1) + "月" + date + "日");
    }
}

//abstract class Person{
//    public static Person getPerson(){
//        return new Student();
//    }
//}
//
//class Student extends Person{
//
//}