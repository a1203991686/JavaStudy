package com.day13.itcast_07;

/*
 * 二分查找法
 */

public class ArrayDemo {
    public static int binarySearch(int[] arr, int value) {
        int min = 0;
        int max = arr.length - 1;
        int mid = (min + max) / 2;

        while (arr[mid] != value) {
            if (arr[mid] > value) {
                max = mid - 1;
            } else if (arr[mid] < value) {
                min = mid + 1;
            }

            if (min > max) {
                return -1;
            }

            mid = (min + max) / 2;
        }

        return mid;
    }
}
