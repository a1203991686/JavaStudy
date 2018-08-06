package com.unit06.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 异常处理
 * 1. Throwable是异常的基类，氛围Error和Exception，在编程中我们关注Exception
 * 2. Exception氛围编译期异常（受检）和运行期异常（非受检）
 * 3. 异常会导致程序中断，无法继续执行
 * 4. 在开发中，我们需要把可能出现异常的代码使用try语句包裹起来
 * 5. 处理异常可以让程序保持运行状态
 * 6. catch可以有多个，顺序为从子类到父类，大的放后面，小的放前面
 *
 * 异常类
 *  ArithmeticException
 *  ArrayIndexOutOfBoundsException
 *  NullPointerException
 *  InputMismatchException
 *  Exception
 *  RuntimeException
 *  ClassNotFoundException
 *  DataFormatException
 *  ClassCastException
 *
 * @author littlecorgi_a1203991686@126.com on 2018/07/28 17:07
 */
public class ExceptionDemo {

    public static void main(String[] args) {
        // div(10, 2);
        // menthod();
        // try {
        //     div2(20, 0);
        // }catch (Exception e){
        //     e.printStackTrace();
        // }
        // System.out.println("over");
        input();
    }

    /**
     * 除法运算
     */
    public static void div(int num1, int num2) {
        int[] arr = {1, 2, 3, 4, 5};
        try {

            System.out.println(arr[4]);
            arr = null;
            System.out.println(arr.length);
            int result = num1 / num2;
            // alt+/
            System.out.println("result=" + result);
        } catch (ArithmeticException e) { //数学算数异常
            System.out.println("除数不能为0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组下标越界");
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        } catch (Exception e) { // 最顶层，排前的一定是范围小的，范围大的，放后面
            System.out.println("出错了");
        } finally { // 不管出没出异常，程序都会执行下面这条语句
            System.out.println("程序执行完毕");
        }

        System.out.println("程序结束");
    }

    private static int menthod() {
        int a = 10;
        int b = 5;
        try {
            System.out.println("a=" + a);
            System.out.println("b=" + b);
            int c = a / b;
            System.out.println("a/b=" + c);
            return c;
        } catch (Exception e) {
            //代码测试时使用
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
        return -1;
    }

    private static int div2(int a, int b) throws ArithmeticException {
        try {
            int c = a / b;
            return c;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("除数不能为0");
        }
    }

    private static void input() {
        // Ctrl+Shift+O
        Scanner in = new Scanner(System.in);
        try {
            int num = in.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            System.out.println("输入不匹配");
        }
        in.close();
    }
}