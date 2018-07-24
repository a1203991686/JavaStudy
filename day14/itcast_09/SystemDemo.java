package com.day14.itcast_09;

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
        // gc()运行垃圾回收器。
        Person p = new Person("撒旦法", 60);
        System.out.println(p);

        p = null; //让p不再指向堆内存
        System.gc();
    }
}
