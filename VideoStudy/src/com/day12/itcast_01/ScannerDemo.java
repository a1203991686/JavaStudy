package com.day12.itcast_01;

/*
 * Scanner : 用于接受接盘录入数据
 *     A:导报
 *     B:创建对象
 *     C:调用方法
 *
 * System类下面有一个静态的字段:
 *     public static final InputStream in; 标准的输入流，对应着键盘录入。
 *
 *     InputStream is = System.in;
 *
 * class Demo{
 *     public static final int x = 10;
 *     public static final Student s = new Student();
 * }
 * int y = Demo.x;
 * Student s = Demo.s;
 *
 * 构造方法: Scanner(InputStream source)
 */

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //创建对象
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        System.out.println("x: " + x);
    }
}
