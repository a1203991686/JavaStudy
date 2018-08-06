package com.day13.itcast_16;

public class CharacterTest {
    public static void main(String[] args) {
        String str = "HelloWorld123";
        int upper = 0;
        int lower = 0;
        int num = 0;
        for (int i = 0; i < str.length(); i++){
            if (Character.isUpperCase(str.charAt(i)))
                upper++;
            if (Character.isLowerCase(str.charAt(i)))
                lower++;
            if (Character.isDigit(str.charAt(i)))
                num++;
        }
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(num);
    }
}
