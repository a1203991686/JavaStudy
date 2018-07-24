package com.day15.itcast_05;

/*
 * 用集合存储5个学生对象，并进行遍历
 */

import java.util.ArrayList;
import java.util.Collection;

public class StudentDemo {
    public static void main(String[] args) {
        Collection a = new ArrayList();

        Student s1 = new Student("123",18);
        Student s2 = new Student("123",18);
        Student s3 = new Student("234",18);
        Student s4 = new Student("345",18);
        Student s5 = new Student("456",18);

        a.add(s1);
        a.add(s2);
        a.add(s3);
        a.add(s4);
        a.add(s5);

        Object[] obj = a.toArray();

        for (int i = 0; i < a.size(); i++){
            Student s = (Student)obj[i];
            System.out.println(s);
        }
    }
}
