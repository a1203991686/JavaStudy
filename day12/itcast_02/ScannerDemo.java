package com.day12.itcast_02;

import java.util.Scanner;

/*
 * 基本格式
 *     public boolean hasNextXxx():判断是否是某种类型的元素
 *     public Xxx nextXxx():获取该元素
 *
 * 举例：用int的方法举例
 *     public boolean hasNextInt()
 *     public int nextInt()
 *
 * 注意：
 *     InputMismatchException:输入的与所需的不匹配
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        if ( in.hasNextInt()){
            int x = in.nextInt();
            System.out.println("x: " + x);
        }else{
            System.out.println("输入的数据有误");
        }
    }
}
