package com.unit09.mapdemo;

import java.util.*;

/**
 * Map接口
 *      1. 键值对存储一组对象
 *      2. Key不能重复（唯一），Value可以重复
 *      3. 具体实现类：HashMap、TreeMap、HashTable、LinkedHashMap
 *      4. HashMap与Hashtable的区别
 *
 *      5. 如何选择使用哪个
 *
 *      6. 数据结构：数组、链表、二叉树（红黑树）、哈希表（数组+链表+二叉树）、栈、队列
 * @author littlecorgi_a1203991686@126.com on 2018/07/25 21:06
 */
public class MapDemo {


    /*
     * 基于二叉树的红黑树实现
     */
    private static void treeMap(){
        // Map<String, String> map = new TreeMap<>();
        // map.put("one", "Lily");
        // map.put("two", "Tom");
        // map.put("three", "Bin");
        // map.forEach((key, value)-> System.out.println(key + "->" + value));

        Map<Dog, String> dogs = new TreeMap<>();
        dogs.put(new Dog(1,"2ha",3), "dog1");
        // dogs.put(new Dog(2,"wangwang",3), "dog2");
        dogs.put(new Dog(1,"wangwang",3), "dog2");//key仍然使用原来的。但是值被换掉了
        // Dog{id=1, name='2ha', age=3}->dog2
        dogs.put(new Dog(3,"hsq",3), "dog3");
        dogs.forEach((key, value)-> System.out.println(key + "->" + value));
    }

    private static void linkedHashMap(){
        /*
         * LinkedHashMap是HashMap的子类，由于HashMap不能保证顺序永久不变，此类使用一个双重链表来维护
         * 元素添加顺序
         */
        Map<String, String> table = new LinkedHashMap<>();
        table.put("one", "Lily");
        table.put("two", "Tom");
        table.put("three", "Bin");
        table.forEach((key, value)-> System.out.println(key + "->" + value));
    }

    /*
     * hashtable
     * JDK1.0开始
     * 基于哈希表实现（数组+链表）
     * 默认数组大小为11，加载因子为0.75
     * 扩充方式：原数组大小<<1（*2）+1
     * 线程安全的，用在多线程访问时，
     */

    private static void hashtable(){
        Map<String, String> table = new Hashtable<>();
        table.put("one", "Lily");
        table.put("two", "Tom");
        table.put("three", "Bin");

        table.forEach((key, value)-> System.out.println(key + "->" + value));
    }

    /*
     * HashMap的实现原理
     *  1. 基于哈希表（数组+链表+二叉树（红黑树））JDK1.8
     *  2. 默认加载因子为0.75，默认数组大小是16
     *  3. 把对象存储到哈希表中，是怎么存储的
     *      把key对象通过hash()方法计算hash值，然后用这个hash值对数组长度取余（默认16），来决定该KEY对象
     *      在数组中存储的位置，当这个位置有多个对象时，以链表结构存储，JDK1.8以后，当链表长度大于8时，
     *      链表将转换为红黑树结构存储
     *      这样的目的，是为了取值更快，存储的数据量更大，性能表现越明显
     *  4. 扩充原理：当数组的容量超过了75%，那么表示该数组需要扩充，
     *      扩充的算法是：当前数组容量<<1（相当于是乘2），扩大一倍，扩充次数过多，会影响性能，每次扩充表示哈希表重新
     *      散列（重新计算每个对象的存储位置），我们在开发中要尽量减少扩充次数带来的性能问题
     *  5. 线程不安全，适合在单线程中使用，
     */
    private static void hashMap(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Tom");
        map.put(2, "Jack");
        map.put(3, "Vince");
        map.put(4, "Bin");
        map.put(5, "Lily");

        System.out.println("size:" + map.size());
        // 从Map中取值
        System.out.println(map.get(1)); // 通过key取value

        // Map的遍历1 (遍历键、值)
        Set<Map.Entry<Integer, String>> entryset = map.entrySet();
        for (Map.Entry e : entryset){
            System.out.println(e.getKey() + "->" + e.getValue());
        }
        System.out.println("-------------------");

        // Map的遍历2 (遍历键)
        Set<Integer> keys = map.keySet();
        for (Integer i : keys) {
            String value = map.get(i);
            System.out.println(i + "->" + value);
        }
        System.out.println("-------------------");

        // Map的遍历3 (遍历值)
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }
        System.out.println("-------------------");

        // Map的遍历4 foreach (遍历值)
        map.forEach((key,value)-> System.out.println(key + "->" + value));
        System.out.println("-------------------");

        System.out.println(map.containsKey(3));
        System.out.println(map.containsKey(7));
        System.out.println(map.containsValue("hhh"));

        //哈希值
        Integer key = 1434;
        System.out.println(1434 % 16);
    }

    public static void main(String[] args) {
        // hashMap();
        // hashtable();
        treeMap();
    }
}
