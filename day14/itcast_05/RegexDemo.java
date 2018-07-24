package com.day14.itcast_05;

/*
 * 获取功能
 *      Pattern和Matcher类的使用
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        //把正则表达式编译成模式对象
        Pattern p = Pattern.compile("a*b");
        //通过模式对象得到匹配器对象，这个时候需要的是被匹配的字符串
        Matcher m = p.matcher("aaaaab");
        //调用匹配器对象的功能
        boolean b = m.matches();
        System.out.println(b);

        String s = "aaaaab";
        String regex = "a*b";
        boolean bb = s.matches(regex);
        System.out.println(bb);
    }
}
