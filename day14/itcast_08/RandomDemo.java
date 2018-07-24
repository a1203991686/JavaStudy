package com.day14.itcast_08;

/*
 * Random类：产生随机数的类
 *
 * 构造方法：
 *      Random():没有给种子，用的是默认种子，是当前时间的毫秒值
 *      Random(long seed)：给定指定种子
 *
 *      给定种子后，每次得到的随机数是相同的。
 *
 * 成员方法
 *      public int nextInt();返回的是int范围内的随机数
 *      public int nextInt(int n);返回时[0,n)范围内的随机数
 */

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random(1111);

        // public int nextInt();返回的是int范围内的随机数
        for (int i = 0; i < 10; i++){
//            int num = r.nextInt();
            int num = r.nextInt(100) + 1;
            System.out.println(num);
        }
        // public int nextInt(int n);返回时[0,n)范围内的随机数
    }
}
