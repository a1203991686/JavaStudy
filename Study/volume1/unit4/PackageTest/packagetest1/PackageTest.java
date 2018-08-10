package com.volume1.unit4.PackageTest.packagetest1;

import static java.lang.System.*;

import com.volume1.unit4.PackageTest.packagetest1.com.horstmann.corejava.*;

/**
 * This program demonstrates the use of package
 * @version 1.11 2018-6-23
 * @author littlecorgi
 */
public class PackageTest {
    public static void main(String[] args){
        Employee harry = new Employee("Harry Hacker",50000,1989,10,1);

        harry.raiseSalary(5);

        out.println("name=" + harry.getName() + ", salary=" + harry.getSalary());
    }
}
