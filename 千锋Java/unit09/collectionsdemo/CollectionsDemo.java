package com.unit09.collectionsdemo;

import java.util.*;

/**
 * @author littlecorgi_a1203991686@126.com on 2018/07/26 11:17
 */
public class CollectionsDemo {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("jack");
        list.add("tom");
        list.add("lily");
        // 反转
        // Collections.reverse(list);

        // 随机排序
        // Collections.shuffle(list);

        // 按自然升序
        // Collections.sort(list);

        // 自定义顺序排序
        // Collections.sort(list,c);

        // 交换元素位置
        // Collections.swap(list, 0, 2);

        // 将所有元素向右移动指定长度
        // Collections.rotate(list, 1);

        // 找到指定元素的位置
        // System.out.println(Collections.binarySearch(list, "tom"));

        // 返回最大元素
        // System.out.println(Collections.max(list));
        // System.out.println(Collections.max(list,s));

        // 返回最小元素
        // System.out.println(Collections.min(list));

        // 填充(全部元素都被替换为obj)
        // Collections.fill(list, "bin");

        // 返回指定对象出现次数
        // System.out.println(Collections.frequency(list,"bin"));

        // 替换
        // Collections.replaceAll(list,"lily","littlecorgi");

        // 同步控制(返回指定集合对象对应的同步对象)
        // List<String> syncList = Collections.synchronizedList(new ArrayList<String>());

        // 设置不可变集合
        // List<String> sList = Collections.emptyList();



        System.out.println(list);
    }
}
