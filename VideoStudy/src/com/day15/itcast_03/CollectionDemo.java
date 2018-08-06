package com.day15.itcast_03;

/*
 * boolean addAll(Collection c):添加一个集合的元素
 * boolean removeAll(Collection c):移除多个元素(哪怕只有一个也能移除)
 * boolean containsAll(Collection c):判断集合中是否包含指定的集合元素
 * boolean retainAll(Collection c):只有包含所有的元素才叫包含
 *      假设两个集合A、B，A对B作交集，
 *      最终的结果保存在A里面，B不变，
 *      返回值表示A是否发生改变
 */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        //创建集合1
        Collection c1 = new ArrayList();
        c1.add("abc1");
        c1.add("abc2");
        c1.add("abc3");
        c1.add("abc4");
        //创建集合2
        Collection c2 = new ArrayList();
        c2.add("abc4");
        c2.add("abc5");
        c2.add("abc6");
        c2.add("abc7");

//        System.out.println("addAll:" + ((ArrayList) c1).addAll(c2));

//        System.out.println("removeAll:" + c1.removeAll(c2));

//        System.out.println("contains:" + c1.containsAll(c2));
        System.out.println("retain:" + c1.retainAll(c2));

        System.out.println("c1:" + c1);
        System.out.println("c2:" + c2);
    }
}
