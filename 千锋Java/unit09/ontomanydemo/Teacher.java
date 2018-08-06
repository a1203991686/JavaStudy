package com.unit09.ontomanydemo;

import java.util.HashSet;

/**
 * 一个老师对应多个学生
 * @author littlecorgi_a1203991686@126.com on 2018/07/26 16:42
 */
public class Teacher {
    private String name;
    private int age;
    private String sex;
    private HashSet<Student> students = new HashSet<>();

    public Teacher() {
        super();
    }

    public Teacher(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public HashSet<Student> getStudents() {
        return students;
    }

    public void setStudents(HashSet<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
