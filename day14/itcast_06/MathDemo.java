package com.day14.itcast_06;

/*
 * Math:用于数学运算的类。
 * 成员变量
 *      public static final double PI
 *      public static final double E
 * 成员方法
 *      public static int abs(int a):取绝对值
 *      public static double ceil(double a):向上取整
 *      public static double floor(double a):向下取整
 *      public static int max(int a, int b):最大值
 *      public static int min(int a, int b):最小值
 *      public static double pow(double a, double b):a的b次幂
 *      public static double random():随机数[0.0 , 1.0)
 *      public static int round(float a):四舍五入
 *      public static double sqrt(double a):开正平方
 */

public class MathDemo {
    public static void main(String[] args) {
        // public static final double PI
        System.out.println("PI:" + Math.PI);
        // public static final double E
        System.out.println("E:" + Math.E);
        System.out.println("------------------");

        // public static int abs(int a)
        System.out.println("abs(10):" + Math.abs(10));
        System.out.println("abs(-10):" + Math.abs(-10));
        System.out.println("------------------");

        // public static double ceil(double a):向上取整
        System.out.println("ceil:" + Math.ceil(12.34));
        System.out.println("ceil:" + Math.ceil(56.78));
        System.out.println("ceil:" + Math.ceil(13.0));
        System.out.println("------------------");

        // public static double floor(double a):向下取整
        System.out.println("floor:" + Math.floor(12.34));
        System.out.println("floor:" + Math.floor(56.78));
        System.out.println("floor:" + Math.floor(13.0));
        System.out.println("------------------");

        // public static int max(int a, int b):最大值
        System.out.println("max:" + Math.max(12, 23));
        System.out.println("max:" + Math.max(12.54, 23));
        // 方法的嵌套调用
        System.out.println("max:" + Math.max(12, Math.max(23, 18)));
        System.out.println("------------------");

        // public static double pow(double a, double b):a的b次幂
        System.out.println("pow:" + Math.pow(2,3));
        System.out.println("------------------");

        // public static double random():随机数[0.0 , 1.0)
        System.out.println("random:" + Math.random());
        System.out.println("random:" + ( (int)(Math.random() * 100 ) + 1 ));
        System.out.println("------------------");

        // public static int round(float a):四舍五入
        System.out.println("round:" + Math.round(12.34f));
        System.out.println("round:" + Math.round(12.56f));
        System.out.println("------------------");

        // public static double sqrt(double a):开正平方
        System.out.println("sqrt:" + Math.sqrt(4));
        System.out.println("sqrt:" + Math.sqrt(16));
    }
}
