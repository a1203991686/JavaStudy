package com.day13.itcast_15;

/*
 * Character 类在对象中包装了一个基本char类型的值
 * 此外，该类提供了几种方法，以确定字符的类别（小写字母，数字，等等），并将字符从小写转大写，反之亦然
 *
 * 构造方法
 *      Character(char value)
 */

public class CharacterDemo {
    public static void main(String[] args) {
        Character ch = new Character('a');
        System.out.println("ch:" + ch);
    }
}
