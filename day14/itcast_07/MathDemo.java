package com.day14.itcast_07;

/*
 * 需求：请设计一个方法实现获取任意范围内的随机数
 */

import java.util.Scanner;

public class MathDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();

        for (int i = 0; i < 100; i++) {
            System.out.println(getRandomRandom(start, end));
        }
    }

    public static int getRandomRandom(int start, int end){
//        int number = (int) (Math.random() * 100) + 1;
        int number = (int) (Math.random() * (end - start + 1) ) + start;
        return number;
    }
}
