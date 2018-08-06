package com.day15.itcast_06;

/*
 * Iterator iterator();迭代器，集合专用的遍历方式
 *      获取元素:Object next();获取元素,并移动到下一个位置
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add("hello");
        c.add("world");
        c.add("java");

        Iterator it = c.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
