package com.volume2.unit2.No1_textfile;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * Created by littlecorgi_a1203991686 on 2018/08/09 17:00.
 * @author littlecorgi
 */
public class TextFileTest {
    public static void main(String[] args) throws IOException {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        // save all employee records to the file employee.dat
        /*
         * JDK1.7新特性
         * try后面括号中的内容所使用的资源，会在try代码块执行完毕后自动释放
         */
        try (PrintWriter ps = new PrintWriter("employee.dat", StandardCharsets.UTF_8)){
            writeData(staff, ps);
        }

        // retrieve all records into a new array
        try (Scanner in = new Scanner(new FileInputStream("employee.dat"), StandardCharsets.UTF_8)){
            Employee[] newStaff = readData(in);

            // print the newly read employee records
            for (Employee e : newStaff){
                System.out.println(e);
            }
        }


    }

    /**
     * Writes all employees in an array to a print writer
     * @param employees an array of employees
     * @param ps a print writer
     */
    private static void writeData(Employee[] employees, PrintWriter ps){
        // write number of employees
        ps.println(employees.length);

        for (Employee e : employees){
            writeEmployee(ps, e);
        }
    }

    /**
     * Reads an array of employee from a scanner
     * @param in the Scanner
     * @return the array of employees
     */
    private static Employee[] readData(Scanner in){
        // retrieve the array size
        int n = in.nextInt();
        in.nextLine(); //consume newline

        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            employees[i] = readEmployee(in);
        }
        return employees;
    }

    /**
     * Writes employee data to a print writer
     * @param ps the print writer
     * @param e an employee
     */
    private static void writeEmployee(PrintWriter ps, Employee e){
        ps.println(e.getName() + "|" + e.getSalary() + "|" + e.getHireDay());
    }

    /**
     * Reads employee data from a buffered reader
     * @param in the Scanner
     */
    private static Employee readEmployee(Scanner in){
        String line = in.nextLine();
        String[] tokens = line.split("\\|");
        String name = tokens[0];
        double salary = Double.parseDouble(tokens[1]);
        LocalDate hireDay = LocalDate.parse(tokens[2]);
        int year = hireDay.getYear();
        int month = hireDay.getMonthValue();
        int day = hireDay.getDayOfMonth();
        return new Employee(name, salary, year, month, day);
    }
}

