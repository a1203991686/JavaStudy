package com.unit06.自定义异常;

/**
 * 自定义异常通常都是通过继承一个异常类来实现
 *  1. Throwable
 *  2. Exception
 *  3. RuntimeException
 *
 * 自定义异常通常的实现是：提供构造方法
 * 异常对象本身是没有实际功能，只是一个有意义的标识
 * @author littlecorgi_a1203991686@126.com on 2018/07/28 19:26
 */
public class MyException extends Exception{
    public MyException(){
        super();
    }

    public MyException(String message){
        super(message);
    }
}
