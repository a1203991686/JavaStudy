package com.unit13.generic;

/**
 * 泛型类
 * T : 参数化类型，在实际使用时才会指定具体的类型
 * 泛型只作用于编译期检查，在编译后，会被擦除
 * @author littlecorgi_a1203991686@126.com on 2018/07/28 16:25
 */
public class Node<T> {
    private T data;

    Node(){
    }

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
