package com.unit09.ontomanydemo;

/**
 * @author littlecorgi_a1203991686@126.com on 2018/07/26 16:42
 */
public class Student {
    private int sid;
    private String sname;
    private int age;
    private Teacher teacher;

    public Student() {
        super();
    }

    public Student(int sid, String sname, int age) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                ", teacher=" + teacher +
                '}';
    }
}
