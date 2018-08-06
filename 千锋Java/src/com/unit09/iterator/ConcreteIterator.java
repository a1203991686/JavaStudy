package com.unit09.iterator;

/**
 * 迭代器接口的具体实现类
 * @author littlecorgi_a1203991686@126.com on 2018/07/26 17:20
 */
public class ConcreteIterator implements Iterator{
    private MyList list = null;
    private int index; //迭代器的指针

    public ConcreteIterator(MyList list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index >= list.getSize())
            return false;
        else return true;
    }

    @Override
    public Object next() {
        Object obj = list.get(index);
        index++;
        return obj;
    }
}
