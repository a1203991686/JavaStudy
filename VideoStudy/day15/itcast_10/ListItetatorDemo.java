package com.day15.itcast_10;

/*
 * 列表迭代器
 *      ListIterator listIterator():List集合特有的迭代器
 *      该迭代器继承了Iterator迭代器。所以，就可以直接使用haxNext()和next()方法
 * 特有功能:
 *      Object previous()
 *      boolean hasPrevious()
 *
 *      注意：previous可以实现逆向遍历，但是逆向之前必须先实现正向遍历，无意义，一般不用
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListItetatorDemo {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("hello");
        list.add("world");
        list.add("java");

        ListIterator lit = list.listIterator(); //子类对象
        // while (lit.hasNext()){
        //     System.out.println(lit.next());
        // }

        while (lit.hasPrevious()){
            System.out.println(lit.previous());
        }
        System.out.println("-------------------");

        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-------------------");
    }
}
