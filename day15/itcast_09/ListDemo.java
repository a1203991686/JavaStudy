package com.day15.itcast_09;

/*
 * List集合的特有功能
 * A:添加功能
 *      void add(int index, Object element):在指定位置添加元素
 * B:获取功能
 *      Object get(int index):获取指定位置的元素
 * C:列表迭代器
 *      ListIterator listIterator():List集合特有的迭代器
 * D:删除功能
 *      Object remove(int index):根据索引删除元素，返回被删除的元素
 * E:修改功能
 *      Object set(int index, Object element):根据索引修改元素，并返回被修饰的元素
 */

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("hello");
        list.add("world");
        list.add("java");

        // list.add(1,"android");
        // list.add(11,"android"); 索引越界
        // list.add(3,"javase");

        // System.out.println("get:" + list.get(1));
        // System.out.println("get:" + list.get(11)); //IndexOutOfBoundsException

        // System.out.println("remove:" + list.remove(1));
        // System.out.println("remove:" + list.remove(11)); //IndexOutOfBoundsException

        System.out.println("set:" + list.set(1,"javaee"));

        System.out.println("list:" + list);
    }
}
