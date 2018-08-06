package com.day14.itcast_21;

/*
 * public void add(int field, int amount):根据给定的日历字段和对应的时间，来对当前的日历进行操作
 * public final void set(int year, int month, int date):设置当前日历的年月日
 */

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");

        c.add(Calendar.YEAR, -3);
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");

        c.add(Calendar.YEAR, 5);
        c.add(Calendar.DATE, -10);
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");
    }
}
