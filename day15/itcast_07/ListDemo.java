package com.day15.itcast_07;

/*
 * 需求：List集合存储字符串并遍历
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList<>();

        list.add("hello");
        list.add("world");
        list.add("java");

        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
