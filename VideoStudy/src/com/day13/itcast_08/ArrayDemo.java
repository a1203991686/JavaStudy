package com.day13.itcast_08;

/*
 * Arrays:针对数组进行操作的工具类。比如说排序和查找
 *      A:public static String toString(int[] a):把数组转为字符串
 *      B:public static String sort(int[] a):把数组排序
 */

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {24,69,81,57,13};
        System.out.println("排序前:" + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("排序后:" + Arrays.toString(arr));

        System.out.println("binarySearch:" + Arrays.binarySearch(arr,57));
        System.out.println("binarySearch:" + Arrays.binarySearch(arr,577));
    }
}
