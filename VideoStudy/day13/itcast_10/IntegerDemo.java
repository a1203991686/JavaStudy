package com.day13.itcast_10;

/*
 * Integer构造方法
 *      public Integer(int values)
 *      public Integer(String s)
 *          注意这个字符串必须是由数字字符组成
 */

public class IntegerDemo {
    public static void main(String[] args) {
        int i = 100;
        Integer ii = new Integer(i);
        System.out.println("ii:" + ii);

        String s = "100";
        Integer iii = new Integer(s);
        System.out.println("iii:" + iii);

        String ss = "abc";
        Integer iiii = new Integer(ss);
        System.out.println("iiii:" + iiii);
    }
}
