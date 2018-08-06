package com.day14.itcast_05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 获取功能：获取下面字符串中由3个字符组成的单词
 * da jia ting wo shuo, jin tian yao xia yu ,bu shang wan zi xi, gao xing bu?
 */
public class RegexDemo2 {
    public static void main(String[] args) {
        String s = "da jia ting wo shuo, jin tian yao xia yu ,bu shang wan zi xi, gao xing bu?";

        String regex = "\\w{3}";

        //把规则编译成模式对象
        Pattern p = Pattern.compile(regex);
        //通过模式对象得到匹配器对象，这个时候需要的是被匹配的字符串
        Matcher m = p.matcher(s);
        //调用匹配器对象的功能
        boolean flag = m.find();
        System.out.println(flag);
    }
}
