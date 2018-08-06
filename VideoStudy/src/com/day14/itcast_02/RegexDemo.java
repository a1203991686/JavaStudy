package com.day14.itcast_02;

/*
 * 判断功能
 *      String类的public boolean matches(String regex)
 *
 * 需求：
 *      判断手机号码是否满足需求
 *
 * 分析：
 *      A:键盘录入手机号码
 *      B:定义手机号码的规则
 *          13436975980
 *          13688886868
 *          13866668888
 *      C:调用功能，判断即可
 *      D:输出结果
 */

import java.util.Scanner;

public class RegexDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你的手机号码");
        String phone = in.nextLine();

        String regex = "1[38]\\d{9}";

        boolean flag = phone.matches(regex);

        System.out.println(flag);
    }
}
