package com.unit09.setdemo;

import java.util.Comparator;

/**
 * @author littlecorgi_a1203991686@126.com
 * @Date 2018/07/25 15:49
 */
public class CatComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getAge() - o2.getAge();
    }
}
