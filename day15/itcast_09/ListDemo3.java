package com.day15.itcast_09;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {
    public static void main(String[] args) {
        List list = new ArrayList();

        Student s1 = new Student("123", 18);
        Student s2 = new Student("234", 18);
        Student s3 = new Student("345", 18);
        Student s4 = new Student("456", 18);
        Student s5 = new Student("567", 18);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
