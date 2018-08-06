package com.unit09.listdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * Collection接口:用于存储单个对象的集合。
 *      List接口:
 *          1. 有序的，可以重复
 *          2. 允许有多个null
 *          3. 具体的实现类:ArrayList,Vector,LinkedList
 *          在实际开发中，我们如何选择list的具体实现？
 *              1. 安全性问题 Vector
 *              2. 是否频繁插入和删除操作 LinkedList
 *              3. 是否只是存储后遍历
 *      Set接口:
 *
 * @author littlecorgi_a1203991686@126.com
 * @Date 2018/07/25 8:47
 */
public class ListDemo {

    /*
     * LinkedList
     * 1. 实现原理，采用双向链表结构实现
     * 2. 适合插入、删除操作，性能高
     * 3.
     */
    private static void linkedList(){
        LinkedList<String> list = new LinkedList<>();
        list.add("苍老师");
        list.add("李老师");
        list.add("张老师");
        list.add("毕老师");

        for (int i = 0; i >list.size(); i++){
            System.out.println(list.get(i));
        }

    }

    /*
     * Vector
     * 1. 实现原理，采用动态对象数组实现，默认构造方法创建了一个大小为10的对象数组
     * 2. 扩充算法：当增量为0时，扩充为原来大小的0倍，当增量大于0时，扩充为原来大小+增量
     * 3. 不适合删除或者插入
     * 4. 为了防止数组动态扩充次数太多，建议创建Vector时，给定初始容量
     * 5. 线程安全，适合在多线程访问时使用，但是在单线程效率太低
     * 面试题：Vector与ArrayList的区别
     */
    private static void vector(){
        Vector<String> v = new Vector();
        v.add("苍老师");
        v.add("李老师");
        v.add("张老师");
        v.add("毕老师");

        for (int i = 0; i < v.size(); i++){
            System.out.println(v.get(i));
        }
    }

    /*
     * ArrayList
     * 1. 实现原理，采用动态对象数组实现，默认构造方法创造了一个空数组
     * 2. 第一次添加元素，扩充容量为10，之后的扩充算法：老容量+老容量的一半
     * 3. 不适合进行删除或者插入操作
     * 4. 为了防止数组动态的扩充次数过多，建议创建ArrayList时，给定初始容量
     * 5. 线程不安全，适合在单线程访问时使用
     * JDK1.2开始
     */
    private static void arrayList(){
        // 使用集合来存储多个不同类型的元素(对象),那么在处理时会比较麻烦，在实际开发中，不建议使用
        // 这样使用，我们应该在一个集合中存储相同的类型对象
        List<String> list = new ArrayList<>(); // JAVA 1.7之后后面<>内的String可以不写，只用写前面的
        list.add("苍老师");
        list.add("李老师");
        list.add("张老师");
        list.add("毕老师");
        // list.add(10); //自动装箱
        int size = list.size();
        for (int i = 0; i < size; i++){
            System.out.println(list.get(i));
        }

        System.out.println(list.contains("苍老师"));
        list.remove("毕老师");
        System.out.println(list.size());

        // String[] array = (String[]) list.toArray();
        // for (String s : array){
        //     System.out.println(s);
        // }
    }

    public static void main(String[] args) {
        // arrayList();
        // vector();
        linkedList();
    }
}
