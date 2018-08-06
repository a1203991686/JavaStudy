package com.unit06.自定义异常;

import java.util.Scanner;

/**
 * 面试题：
 *  Exception与RuntimeException的区别
 *      Exception:受检异常，在编译期检查，在调用抛出这个异常的方法时，必须显示的使用的try...catch...
 *      RuntimeException：非受检异常，在运行期检查，在调用抛出这个异常的方法时，可以不用显示的使用try...catch...
 *      在使用自定义异常时，根据实际的业务要求来决定使用哪个作为父类
 * @author littlecorgi_a1203991686@126.com on 2018/07/28 19:49
 */
public class LoginDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = in.nextLine();
        System.out.println("请输入密码");
        String pass = in.nextLine();
        UserService us = new UserService();
        try{
            User user = us.login(name, pass);
            System.out.println("登录成功");
            System.out.println(user);
       }catch (MyException e){
           e.printStackTrace();
       }
        in.close();
    }
}
