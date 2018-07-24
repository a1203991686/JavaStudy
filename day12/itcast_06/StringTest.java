package com.day12.itcast_06;

/*
 * 模拟登陆，给三次机会
 */

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String PW = "jjj"; //密码
        for (int i = 0; i < 3; i++){
            String str = new String(); //输入
            str = in.nextLine();
            if (!str.equals(PW)){
                System.out.println("密码输入错误,还有" + (2 - i) + "次机会");
                System.out.println("请重新输入");
            } else {
                break;
            }
            if (i == 2){
                System.out.println("3次错误，退出系统");
                System.exit(0);
            }
        }

        System.out.println("登录成功");
        GuessNum gn = new GuessNum();
        gn.start();
    }
}
