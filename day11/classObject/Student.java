package com.day11.classObject;

import java.util.Objects;

public class Student implements Cloneable {
    private String name;
    private String num;

    public Student(String name, String num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", num='" + num + '\'' +
                '}';
    }

    public String toString1(){
        return super.toString();
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return Objects.equals(name, student.name) &&
//                Objects.equals(num, student.num);
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com.day11.classObject.Student student = (com.day11.classObject.Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(num, student.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, num);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
