package com.day15.itcast_07;

/*
 * List集合的特点
 *      有序(存储和取出的元素一致)，可重复
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("JaveSe");
        list.add("java");
        list.add("JaveSe");

        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
