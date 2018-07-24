package com.day12.itcast_09;

/*
 * String其他功能
 *      替换
 *          String replace(char old, char new)
 *          String replace(String old, String new)
 *      去除字符串两空格
 *          String trim()
 *      字典顺序表两个字符串
 *          int compareTo(String str)
 *          int compareToIgnoreCase(String str)
 */

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "helloworld";
        String s2 = s1.replace('l', 'k');
        String s3 = s1.replace("owo", "ak47");
        System.out.println("s1:" + s1);
        System.out.println("s2:" + s2);
        System.out.println("s3:" + s3);
        System.out.println();

        String s4 = " helloworld ";
        String s5 = s4.trim();
        System.out.println("s4:" + s4 + "---");
        System.out.println("s5:" + s5 + "---");
        System.out.println();

        String s6 = "hello";
        String s7 = "hello";
        String s8 = "abc";
        String s9 = "xyz";
        System.out.println(s6.compareTo(s7)); //0 h-h
        System.out.println(s6.compareTo(s8)); //7 h-a
        System.out.println(s6.compareTo(s9)); //-16 h-x
        /**
         * 逐个往后比，不同的输出ascii差值，完全相同输出0
         */
    }
}
