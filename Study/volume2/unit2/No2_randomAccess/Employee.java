package com.volume2.unit2.No2_randomAccess;

import java.time.LocalDate;

/**
 * Created by littlecorgi_a1203991686 on 2018/08/09 17:01.
 * @author littlecorgi_a1203991686@126.com
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;
    public static final int NAME_SIZE = 40;
    public static final int RECORD_SIZE = 2*NAME_SIZE+8+4+4+4;

    public Employee() {
    }

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(int year, int month, int day) {
        this.hireDay = LocalDate.of(year, month, day);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}
