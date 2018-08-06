package com.unit09.mapdemo;

/**
 * @author littlecorgi_a1203991686@126.com on 2018/07/26 9:53
 */
public class Dog implements Comparable<Dog>{
    private int id;
    private String name;
    private int age;

    public Dog(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Dog() {
        super();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Dog o) {
        return this.id - o.id;
    }
}
