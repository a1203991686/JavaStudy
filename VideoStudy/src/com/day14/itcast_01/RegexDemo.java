package com.day14.itcast_01;

/*
 * 正则表达式：符合一定规则的字符串
 */

import java.util.Scanner;

public class RegexDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入QQ号码");
        String qq = in.nextLine();

        System.out.println("chechQQ:" + checkQQ(qq));
    }

    public static boolean checkQQ(String qq){
//        String regex = "[1-9][0-9]{4,14}";
//        //public boolean matches(String regex)告知此字符串是否匹配给定的正则表达式
//        boolean flag = qq.matches(regex);
//        return flag;
        return qq.matches("[1-9][0-9]{4,14}");
    }
}


