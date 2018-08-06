package com.day15.itcast_10;

/*
 * 判断集合中有没有"world"这个元素，如果有，就再添加一个"javaee"
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo2 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("hello");
        list.add("world");
        list.add("java");

        ListIterator lit = list.listIterator();

        while (lit.hasNext()) {
            String s = (String)lit.next();
            if (s.equals("world")) {
                lit.add("javaee");
            }
        }

        LinkedList lst = new LinkedList<>();

        ListIterator lit1 = list.listIterator();
        while (lit1.hasNext()) {
            System.out.println(lit1.next());
        }
    }
}

