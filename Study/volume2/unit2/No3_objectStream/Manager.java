package com.volume2.unit2.No3_objectStream;

import java.time.LocalDate;

/**
 * @author littlecorgi
 * @data 2018/08/10
 */
public class Manager extends Employee{
    private Employee secretary;

    public Manager(Employee secretary) {
        this.secretary = secretary;
    }

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
    }

    public Employee getSecretary() {
        return secretary;
    }

    public void setSecretary(Employee secretary) {
        this.secretary = secretary;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
    }

    @Override
    public LocalDate getHireDay() {
        return super.getHireDay();
    }

    @Override
    public void setHireDay(int year, int month, int day) {
        super.setHireDay(year, month, day);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + super.getName() + '\'' +
                ", salary=" + super.getSalary() +
                ", hireDay=" + super.getHireDay() +
                ", secretary=" + secretary +
                '}';
    }
}
