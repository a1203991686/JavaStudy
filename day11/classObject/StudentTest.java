package com.day11.classObject;

public class StudentTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        {
            com.day11.classObject.Student s1 = new com.day11.classObject.Student("123", "123");
            System.out.println(s1.hashCode()); //1929600551
            com.day11.classObject.Student s2 = new com.day11.classObject.Student("123", "123");
            System.out.println(s2.hashCode()); //1690716179
        }
        System.out.println("==============================");
        {
            com.day11.classObject.Student x = new com.day11.classObject.Student("123", "123");
            Class c = x.getClass();
            System.out.println(c.getName()); //com.classObject.Student
            // 链式编程
            String str1 = x.getClass().getName(); //com.classObject.Student
            System.out.println(str1); //与上面结果一样
        }
        System.out.println("==============================");
        {
            com.day11.classObject.Student s1 = new com.day11.classObject.Student("123", "123");
            System.out.println(s1.hashCode()); //1053782781
            System.out.println(Integer.toHexString(s1.hashCode())); //3ecf72fd
            System.out.println(s1.getClass()); //class com.classObject.Student
            System.out.println(s1.toString1()); //com.classObject.Student@3ecf72fd
            System.out.println(s1.toString()); //Student{name='123', num='123'}
            System.out.println(s1);
        }
        System.out.println("==============================");
        {
            com.day11.classObject.Student s1 = new com.day11.classObject.Student("123", "123");
            com.day11.classObject.Student s2 = new com.day11.classObject.Student("123", "123");
            System.out.println(s1 == s2); //false
            System.out.println(s1.equals(s2));
        }
        System.out.println("==============================");
        {
            com.day11.classObject.Student s1 = new com.day11.classObject.Student("123", "123");
            Object obj = s1.clone();
            com.day11.classObject.Student s2 = (com.day11.classObject.Student)obj;
            System.out.println(s2.toString()); // Student{name='123', num='123'}
            System.out.println();
            Student s3 = s1;
            System.out.println(s3.toString()); // Student{name='123', num='123'}
            System.out.println();
            s3.setName("dfas");
            s3.setNum("234");
            System.out.println(s1.toString()); // Student{name='dfas', num='234'}
            System.out.println(s2.toString()); // Student{name='123', num='123'}
            System.out.println(s3.toString()); // Student{name='dfas', num='234'}
        }
    }
}
