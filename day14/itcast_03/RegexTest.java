package com.day14.itcast_03;

/*
 * 输入："91 27 46 38 50"
 * 输出："27 38 46 50 91"
 */

import java.util.Arrays;

public class RegexTest {
    public static void main(String[] args) {
        String str = "91 27 46 38 50";

        String regex = " ";

        String[] str2 = str.split(regex);
        int[] sums = new int[str2.length];

        for (int i = 0; i < str2.length; i++) {
            sums[i] = Integer.parseInt(str2[i]);
        }

        Arrays.sort(sums);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str2.length; i++) {
            sb.append(sums[i]).append(" ");
        }

        String result = sb.toString().trim();
        System.out.println(result);
    }
}
