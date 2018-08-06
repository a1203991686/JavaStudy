package com.day14.itcast_10;

/*
 * System类包含一些有用的类字段和方法。他不能被实例化
 *
 * 成员方法
 *      public static void gc()
 *      public static void exit(int status)
 *      public static void currentTimeMillis()
 *      public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
 */

public class SystemDemo {
    public static void main(String[] args) {
        // public static void exit(int status)
        System.out.println("我们喜欢");
//        System.exit(0);
        System.out.println("我们也喜欢");
        System.out.println("-------------");
[]
        // public static void currentTimeMillis()以毫秒为单位返回当前值
        System.out.println(System.currentTimeMillis());
        // 单独得到这样的时间目前对我们来说意义不大，那么他有啥意义
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            System.out.println("hello" + i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时" + (end - start) + "ms");
    }
}
