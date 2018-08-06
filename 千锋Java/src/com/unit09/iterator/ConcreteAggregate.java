package com.unit09.iterator;

/**
 * 集合的实现类
 * @author littlecorgi_a1203991686@126.com on 2018/07/26 17:20
 */
public class ConcreteAggregate implements MyList{
    private Object[] elements; //对象数组
    private int size;
    private int index;

    public ConcreteAggregate() {
        elements = new Object[100];
    }

    @Override
    public void add(Object e) {
        elements[index++] = e;
        size++;
    }

    @Override
    public Object get(int index) {
        return elements[index];
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public int getSize() {
        return size;
    }
}
