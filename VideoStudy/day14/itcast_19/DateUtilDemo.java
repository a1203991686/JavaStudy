package com.day14.itcast_19;

import java.util.Date;

public class DateUtilDemo {
    public static void main(String[] args) {
        Date d = new Date();
        String s = DateUtil.dateToString(d, "yyy-MM-dd HH:mm:ss");
        System.out.println(s);
    }
}
