package com.volume1.unit6.clone;

/**
 * This program demonstrates cloning
 * @version 1.10 2018-7-21
 * @author a1203
 */

public class Clone {
    public static void main(String[] args) {
        try
        {
            Employee original = new Employee("John Q. Public",50000);
            original.setHireDay(2000,1,1);
            Employee copy = original.clone();
            copy.raiseSalary(10);
            copy.setHireDay(2002,12,31);
            System.out.println("original = " + original);
            System.out.println("copy = " + copy);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
