package com.day12.itcast_03;

/*
 * 常用的两个方法：
 *      public int nextInt():获取一个int的值
 *      public String nextLine():获取一个String的值
 *
 * 出现问题
 *      想获取一个数值再获取一个字符串
 *      主要原因：换行符会被nextLine扫描进去
 * 如何解决
 *      A:先获取一个数值后，再创建一个新的键盘录入对象获取字符串
 *      B:把所有的数据都先按照字符串获取，然后要什么对应的转化为什么
 */

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        if ( i == 1) {
            Scanner sc1 = new Scanner(System.in);
            int a = sc1.nextInt();
            Scanner sc2 = new Scanner(System.in);
            String str1 = sc2.nextLine();
            System.out.println("a:" + a + ",str1:" + str1);
        } else {

        }

//        int a = in.nextInt();
//        int b = in.nextInt();
//        System.out.println("a = " + a + " ,b = " + b);
//
//        String s1 = in.nextLine();
//        String s2 = in.nextLine();
//        System.out.println("s1 = " + s1 + " ,s2 = " + s2);

//        String s1 = in.nextLine();
//        int a = in.nextInt();
//        System.out.println("s1 = " + s1 + " ,a = " + a);


    }
}
