package com.unit09.iterator;

/**
 * 容器的接口
 * @author littlecorgi_a1203991686@126.com on 2018/07/26 17:20
 */
public interface MyList {
    void add(Object e);
    Object get(int index);
    Iterator iterator();
    int getSize();
}
