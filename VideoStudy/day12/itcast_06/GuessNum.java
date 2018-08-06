package com.day12.itcast_06;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void start() {
        Random ra = new Random();
        int x = ra.nextInt(100);
        System.out.println("开始猜数字!!!");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        while (true){
            if (a > x){
                System.out.println("猜大了");
            } else if (a < x){
                System.out.println("猜小了");
            } else if (a == x){
                System.out.println("恭喜你，猜对了");
                break;
            }
            a = in.nextInt();
        }
    }
}
