package com.day15.itcast_01;

/*
 * 我有5个学生，请把这5个学生的信息存入到数组，并遍历数组，获得每一个学生的信息
 *      学生:Student
 *      成员变量:name,age
 *      构造方法:无参、带参
 *      成员方法:getXxx()/setXxx()
 *      存储学生信息的数组?想想应该是什么样子的
 * 分析
 *      A:创建学生类
 *      B:创建学生数组
 *      C;创建5个学生对象，并赋值
 *      D:把C步骤的元素放入数组中
 *      E:遍历数组
 */

import java.util.ArrayList;

public class ObjectArrayDemo {
    public static void main(String[] args) {
        Student[] stus = new Student[5];

        stus[0] = new Student("123",18);
        stus[1] = new Student("234",18);
        stus[2] = new Student("345",18);
        stus[3] = new Student("456",18);
        stus[4] = new Student("567",19);

        for (int i = 0; i < stus.length; i++){
            System.out.println(stus[i]);
        }
    }
}
