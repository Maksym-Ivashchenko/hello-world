package ua.goit.module7;

import java.util.HashMap;
import java.util.Map;

public class HashMapWithCustomKey {

    public static void main(String[] args) {

        Map<Employee, String> employees = new HashMap<>();

        Employee employee1 = new Employee(1, "Olexander");
//        employee1.setId(1);
//        employee1.setName("Olexander");

        Employee employee2 = new Employee(1, "Olexander");
//        employee2.setId(1);
//        employee2.setName("Olexander");

        employees.put(employee1, "Kyiv");
        employees.put(employee2, "London");

        System.out.println(employees);
    }
}
