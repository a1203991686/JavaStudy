package com.day14.itcast_02;

/*
 * 判断功能
 *      String类的public boolean matches(String regex)
 *
 * 需求：
 *      判断邮箱是否满足需求
 *
 * 分析：
 *      A:键盘录入邮箱
 *      B:定义邮箱的规则
 *          1517806580@qq.com
 *          1203991686@126.com
 *          fengqingyang@sina.com.cn
 *          lingqingxia@163.com
 *      C:调用功能，判断即可
 *      D:输出结果
 */

import java.util.Scanner;

public class RegexTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入邮箱");
        String email = in.nextLine();

        // String regex = "[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,6}(\\.[a-zA-Z_0-9]{2,3})+";
        String regex = "\\w+@\\w{2,6}(\\.\\w{2,3})+";

        boolean flag = email.matches(regex);
        System.out.println(flag);
    }
}
