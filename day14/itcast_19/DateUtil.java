package com.day14.itcast_19;

/**
 * @author  littlecorgi
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    private DateUtil(){
    }


    /**
     * 这个方法的作用就是把日期转成字符串
     * @param d 被转换的日期对象
     * @param format 传递过来的要被转换的格式
     * @return 格式化后的字符串
     */
    public static String dateToString(Date d, String format){
        return new SimpleDateFormat(format).format(d);
    }

    /**
     * 这个方法就是把一个字符串解析成一个日期对象
     * @param s 被解析的字符串
     * @param format 传递过来的要被解析的格式
     * @return 解析后的字符串
     * @throws ParseException
     */
    public static Date StringToDate(String s, String format) throws ParseException {
        return new SimpleDateFormat(format).parse(s);
    }
}
