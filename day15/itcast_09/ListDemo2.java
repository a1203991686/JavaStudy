package com.day15.itcast_09;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("hello");
        list.add("world");
        list.add("java");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        // IndexOutOfBoundsException
        // System.out.println(list.get(3));

       // for (int i = 0; i < 3; i++){
       //     System.out.println(list.get(i));
       // }

        // 如果元素过多，数起来就比较麻烦，所以我们使用集合的一个长度功能：size()
        // 最终的遍历方式就是:size()和get()
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
