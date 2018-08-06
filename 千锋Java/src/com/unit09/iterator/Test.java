package com.unit09.iterator;

/**
 * @author littlecorgi_a1203991686@126.com on 2018/07/26 17:21
 */
public class Test {
    public static void main(String[] args) {
        MyList list = new ConcreteAggregate();
        list.add("刘备");
        list.add("张飞");
        list.add("关羽");
        list.add("曹操");
        list.add("诸葛亮");
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
