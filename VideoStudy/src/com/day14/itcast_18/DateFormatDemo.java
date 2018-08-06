package com.day14.itcast_18;

/*
 * Date -- String (格式化)
 *      public final String format(Date date)
 * String -- Date (解析)
 *      public Date parse(String source)
 *
 * DateFormat:可以进行日期和字符串的格式化和解析，但是由于是抽象类，所以使用具体子类SimpleDateFormat
 *
 * SimpleDateFormat构造方法
 *      SimpleDateFormat():默认模式
 *      SimpleDateFormat(String pattern):给定模式
 *          通过查看API我们得到了对应的模式
 *             年 Y
 *             月 M
 *             日 d
 *             时 H
 *             分 m
 *             秒 s
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");

        String s = sdf.format(d);
        System.out.println(s);

        // String -- Date
        String str = "2008-08-08 12:12:12";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        Date dd = sdf2.parse(str);
        System.out.println(dd);
    }
}
