package com.day12.itcast_07;

/*
 * 统计一个字符串中有几个大写字母、几个小写字母、几个数字
 *      "Hello123World"
 */

public class StringTest {
    public static void main(String[] args) {
        String x = "Hello123World";
        int capital = 0;
        int lowercase = 0;
        int sum = 0;

        for (int i = 0; i < x.length(); i++){
            if (x.charAt(i) > 65 && x.charAt(i) < 91) {
                capital++;
            }
            else if (x.charAt(i) > 96 && x.charAt(i) < 123) {
                lowercase++;
            }
            else if (x.charAt(i) > 48 && x.charAt(i) < 58) {
                sum++;
            }
        }
        System.out.println(capital + " " + lowercase + " " + sum);
    }
}
