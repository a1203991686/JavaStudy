package com.unit09.mapnewmethoddemo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author littlecorgi_a1203991686@126.com on 2018/07/26 10:37
 */
public class MapNewMethodDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "jack");
        map.put(2, "tom");
        map.put(3, "lily");

        // System.out.println(map.getOrDefault(4, "null"));
        //
        // map.putIfAbsent(1,"hhh");
        // map.putIfAbsent(4,"vince");
        // map.forEach((key, value)-> System.out.println(key + "->" + value));

        // 根据键和值都匹配时，才删除
        // map.remove(1,"jack");
        // map.forEach((key, value)-> System.out.println(key + "->" + value));

        // map.compute(1, (k,v1)->v1+"1");
        // map.computeIfAbsent(5, (val)->val+"test");

        map.merge(1, "888", (v1, v2) -> v1.concat(v2));


        map.forEach((key, value)-> System.out.println(key + "->" + value));

    }
}
