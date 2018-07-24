package com.day14.itcast_11;

/*
 * System类包含一些有用的类字段和方法。他不能被实例化
 *
 * 成员方法
 *      public static void gc()
 *      public static void exit(int status)
 *      public static void currentTimeMillis()
 *      public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
 */

import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args) {
        // public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        // 从指定源数组中复制一个数组，复制从指定位置开始，到目标数组结束
        int[] arr1 = {11, 22, 33, 44, 55};
        int[] arr2 = {6, 7, 8, 9, 10};

        System.arraycopy(arr1, 1, arr2, 2, 2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
