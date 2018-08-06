package com.unit13.generic;

import java.util.*;

/**
 *
 * @author littlecorgi_a1203991686@126.com on 2018/07/28 16:03
 */
public class GenericDemo {

    public static void test5(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "vince");
        map.put(2, "tom");

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry entry : entrySet){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }

    public static void test4(){
        String[] arrays = {"vince", "jiack", "Tom", "lily"};
        System.out.println(Arrays.toString(func(arrays, 0, 2)));
    }

    public static void test3(){
        Node<Number> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        // getData(n1);
        // getData(n2);
        getData2(n1);
        getData2(n2);
        getUpperNumberData(n1);
        getUpperNumberData(n2);

    }

    public static void getData(Node<Number> node){
        System.out.println(node.getData());
    }

    /**
     * 使用通配符定义泛型的类型，此时只能输出，不能修改
     * @param node
     */
    public static void getData2(Node<?> node){
        // node.setData(20); // 错误
        System.out.println(node.getData());
    }

    // ? super 类：设置泛型的下限
    // ? extends 类：设置泛型的上限
    public static void getUpperNumberData(Node<? extends Number> data){
        // 只能是Number类及其子类
        System.out.println("data:" + data.getData());
    }

    /**
     * 泛型方法
     * 交换传入的两个数据的顺序
     * @param array 数组
     * @param i 其中一个数据的下标
     * @param t 另一个数据的下标
     * @param <T> 泛型
     * @return 返回修改后的数组
     */
    public static <T> T[] func(T[] array, int i, int t){
        T temp = array[i];
        array[i] = array[t];
        array[t] = temp;
        return array;
    }

    public static void test2(){
        Node<String> stringNode = new Node<>("vince");
        Node<Integer> intNode = new Node<>(10);

        System.out.println(stringNode.getData());
        System.out.println(intNode.getData());
    }

    public static void test1(){
        List list = new ArrayList<>();
        list.add("vince");
        list.add(10);
        list.add(new Object());

        for (int i = 0; i < list.size(); i++){
            // 如果我们不能确定集合中元素类型，那么我们需要在处理元素时
            // 要判断元素的类型，才能做相应的操作

        }
    }

    public static void main(String[] args) {
        // test1();
        // test2();
        // test3();
        test4();
    }
}
