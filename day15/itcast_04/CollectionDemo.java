package com.day15.itcast_04;

/*
 * 集合的遍历。依次获取集合中每一个元素。
 * Object[] toArray():把集合转为数组，实现集合的遍历
 */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add("hello"); // Object obj = "hello"; 向上造型
        c.add("world");
        c.add("java");

        Object[] objs = c.toArray();
        for (int x = 0; x < objs.length; x++){
            //System.out.println(objs[x]);
            //我知道元素是字符串，在获取元素的同时。获取长度
            //System.out.println(objs[x] + "---" + objs[x].length);
            String s = (String) objs[x];
            System.out.println(s + "---" + s.length());
        }
    }
}
