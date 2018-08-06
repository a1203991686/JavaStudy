package com.day15.itcast_02;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 集合的由来：
 *      我们学习的是面向对象语言，而面向对象语言对事物的描述是通过对象体现的。为了方便对多个对象进行操作，我们就必须把这多个对象进行储存。
 *      而想存储多个对象，就不能是一个基本的变量，而应该是一个容器类型的变量，在我们目前学过的知识里面，有哪些是容器类型呢？
 *      数组和StringBuffer。但是，StringBuffer的结果是一个字符串，比一定满足我们的需求，所以我们只能选择数组，这就是对象数组。
 *      而对象数组又不能适应变化的需求，因为数组的长度是固定的，这个时候，为了适应变化的需要，Java为我们提供集合类
 *
 * 数组和集合的区别
 *      A:长度区别
 *          数组长度固定
 *          集合长度可变
 *      B:内容不同
 *          数组存储的是同一种类型的元素
 *          集合可以存储不同类型的元素
 *      C:元素的数据类型
 *          数组可以存储基本数据类型，也可以存储引用数据类型
 *          集合只能存储引用类型
 *
 * 刚说过集合是存储多个元素的，但是，存储多个元素也是有不同需求。比如说：多个元素不能有相同元素；要这多个元素按照某种规则排序一下
 * 针对不同的需求，Java提供了不同的集合类，这样呢，java就提供了很多个集合类，这多个集合类的数据结构不同
 * 结构不同不重要，重要的是你得存储东西，并且还能使用这些东西
 *
 * 数据结构：数据的存储方式。
 *
 * Collection:是集合的顶层接口，他的子体系，有重复的，有唯一的，有有序的，有无序的
 *
 * Collection的功能概述
 *      1: 添加
 *          boolean add(Object a):添加一个元素
 *          boolean addAll(Collection c):添加一个集合的元素
 *      2: 删除
 *          void clear():移除所有元素
 *          boolean remove(Object o):移除一个元素
 *          boolean removeAll(Collection c):移除多个元素(哪怕只有一个也能移除)
 *      3: 判断
 *          boolean contains(Object o):判断集合中是否包含此元素
 *          boolean containsAll(Collection c):判断集合中是否包含指定的集合元素
 *          boolean isEmpty():判断集合是否为空
 *      4: 获取
 *          Iterator<E> iterator()重点
 *      5: 长度
 *          int size():元素个数
 *      6: 交集
 *          boolean retainAll(Collection c):只有包含所有的元素才叫包含
 *      7: 把集合转为数组
 *          Object[] toArray()
 *
 */
public class CollectionDemo {
    public static void main(String[] args) {
        //测试不带All的方法

        Collection c = new ArrayList();
        c.add("hello");
        c.add("world");
        c.add("java");

//        c.clear();

//        System.out.println("remove:" + c.remove("hello"));
//        System.out.println("remove:" + c.remove("hesdfllo"));

//        System.out.println("contains:" + c.contains("hello"));
//        System.out.println("contains:" + c.contains("android"));

//        System.out.println("isEmpty:" + c.isEmpty());
//        c.clear();
//        System.out.println("isEmpty:" + c.isEmpty());

//        System.out.println("size:" + c.size());



        System.out.println("c:" + c);
    }
}
