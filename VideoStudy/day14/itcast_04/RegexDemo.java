package com.day14.itcast_04;

/*
 * 替换
 *      String类的public String replaceAll(String regex, String replacement)
 */

public class RegexDemo {
    public static void main(String[] args) {
        String s = "hello213456worldkh622112345678java";

        String regex = "\\d";
        String ss = "*";

        String result = s.replaceAll(regex, ss);
        System.out.println(result);
    }
}
