package com.volume1.unit7.stackTrace;

import java.util.Scanner;

/**
 * A program that displays a trace feature of a recursive method call
 * @author littlecorgi_a1203991686@126.com on 2018/07/27 16:52
 */
public class StackTraceTest {
    /**
     * Computes the factorial of a number
     * @param n a non-negative integer
     * @return n! = 1 * 2* 3 * 4 * 5 * ... * n
     */
    public static int factorial(int n){
        System.out.println("facorrial(" + n + ");");
        Throwable t = new Throwable();
        StackTraceElement[] frames = t.getStackTrace();
        for (StackTraceElement f : frames){
            System.out.println(f);
        }
        int r;
        if (n <= 1) r = 1;
        else r = n * factorial(n - 1);
        System.out.println("return" + r);
        return r;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = in.nextInt();
        factorial(n);
    }
}
