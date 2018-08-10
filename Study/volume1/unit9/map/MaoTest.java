package com.volume1.unit9.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author littlecorgi_a1203991686@126.com on 2018/07/27 9:37
 */
public class MaoTest {
    public static void main(String[] args) {
        Map<String, Employee> staff = new HashMap<>();
        staff.put("144-25-5464",new Employee("Amy Lee"));
        staff.put("567-24-2546", new Employee("Harry Hacker"));
        staff.put("157-62-7935", new Employee("Gary Cooper"));
        staff.put("456-62-5527", new Employee("Francesca Cruz"));

        // print all entries

        System.out.println(staff);

        // remove an entry
        staff.remove("567-24-2546");

        // replace an entry

        staff.replace("456-62-5527", new Employee("Francesca Miller"));

        // look up a value

        System.out.println(staff.get("157-62-7935"));

        // iterator through all entries

        staff.forEach((k,v)-> System.out.println(k + "->" + v));
    }
}

class Employee{
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
