package com.day14.itcast_03;

/*
 * 分割功能
 *      String类的public String[] split(String regex)
 *      根据给定的正则表达式的匹配拆分此字符串
 *
 * 举例:
 *      百合网，世纪佳缘，珍爱网
 *      搜索好友
 *          性别：女
 *          范围：18-24
 *
 */

import java.util.Scanner;

public class RegexDemo {
    public static void main(String[] args) {
        String ages = "18-24";

        String regex = "-";

        String[] strArray = ages.split(regex);

        for (int x = 0; x < strArray.length; x++)
            System.out.println(strArray[x]);

        int startAge = Integer.parseInt(strArray[0]);
        int endAge = Integer.parseInt(strArray[1]);

        Scanner in = new Scanner(System.in);
        System.out.println("请输入你的年龄");
        int age = in.nextInt();

        if (age >= startAge && age <= endAge){
            System.out.println("找到了");
        } else {
            System.out.println("不符合");
        }
    }
}
