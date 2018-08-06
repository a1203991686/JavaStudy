package com.unit09.ontomanydemo;

/**
 * @author littlecorgi_a1203991686@126.com on 2018/07/26 16:51
 */
public class OneToManyDemo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("张老师",18,"女");
        Student s1 = new Student(1,"小李",10);
        Student s2 = new Student(2,"小王",12);
        Student s3 = new Student(3,"小赵",11);

        // 关联关系
        t1.getStudents().add(s1);
        t1.getStudents().add(s2);
        t1.getStudents().add(s3);

        s1.setTeacher(t1);
        s2.setTeacher(t1);
        s3.setTeacher(t1);

        print(t1);
    }

    private static void print(Teacher t){
        System.out.println(t);

        for (Student s : t.getStudents()){
            System.out.println(s);
        }
    }
}
