package com.day12.itcast_08;

/*
 * String转换功能
 *      byte[] getBytes():把字符串转为字节数组
 *      char[] toCharArray():把字符串转为字符数组
 *      static String valueOf(char[] chs):把字符数组转为字符串
 *      static String valueOf(int i):把int类型的数据转成字符串
 *          注意：String的valueOf可以吧任意类型数据转为字符串
 *      String toLowerCase()
 *      String toUpperCase():转为大写
 *      String concat(String str):拼接字符串
 */

public class StringDemo {
    public static void main(String[] args) {
        String s = "JavaSE";

        //byte[] getBytes():把字符串转为字节数组
        byte[] bys = s.getBytes();
        for (int x = 0; x < bys.length; x++){
            System.out.println(bys[x]);
        }
        System.out.println("-------------");

        //char[] toCharArray():把字符串转为字符数组
        char[] chs = s.toCharArray();
        for (int x = 0; x < chs.length; x++){
            System.out.println(chs[x]);
        }
        System.out.println("-------------");

        //static String valueOf(char[] chs):把字符数组转为字符串
        String ss = String.valueOf(s);
        System.out.println(ss);
        System.out.println("-------------");

        //static String valueOf(int i):把int类型的数据转成字符串
        int i = 100;
        String sss = String.valueOf(i);
        System.out.println(sss);
        System.out.println("-------------");

        //String toLowerCase()
        System.out.println("toLowerCase:" + s.toLowerCase());
        System.out.println("-------------");

        //String concat(String str):拼接字符串
        String s1 = "hello";
        String s2 = "world";
        String s3 = s1 + s2;
        String s4 = s1.concat(s2);
        System.out.println("s3 == s4:" + (s3 == s4)); //false
        System.out.println("s3.equals(s4):" + s3.equals(s4)); //true
    }
}
