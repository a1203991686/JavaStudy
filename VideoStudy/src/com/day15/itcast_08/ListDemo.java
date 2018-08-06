package com.day15.itcast_08;

/*
 * 存储自定义对象并遍历
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
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

        Iterator it = list.iterator();

        while (it.hasNext()){
            System.out.println( it.next());
        }

    }
}
