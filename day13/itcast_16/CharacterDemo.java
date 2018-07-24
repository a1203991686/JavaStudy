package com.day13.itcast_16;

/*
 * public static boolean isUpperCase(char ch):判断是否是小写
 * public static boolean isLowerCase(char ch):判断是否是大写
 * public static boolean isDigit(char ch):判断是否是数字
 * public static char toUpperCase(char ch):把给定的字符转为大写
 * public static char toLowerCase(char ch):把给定的字符转为小写
 */

public class CharacterDemo {
    public static void main(String[] args) {
        System.out.println("isUpperCase: " + Character.isUpperCase('A')); //true
        System.out.println("isUpperCase: " + Character.isUpperCase('a')); //false
        System.out.println("isUpperCase: " + Character.isUpperCase('0')); //false

        System.out.println("toUpperCase: " + Character.toUpperCase('a')); //A
        System.out.println("toUpperCase: " + Character.toUpperCase('A')); //A
    }
}
