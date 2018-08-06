package com.unit06.assertDemo;

/**
 * @author littlecorgi_a1203991686@126.com on 2018/07/28 20:08
 */
public class AssertDemo {

    public static void main(String[] args){
        int result = add(10,10);
        assert result == 20 : "结果不正确";
    }

    private static int add(int a, int b){
        return a + b + 1;
    }
}
