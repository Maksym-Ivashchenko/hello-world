package ua.goit.module7;

import java.util.TreeMap;

public class TreeMapExample1 {
    public static void main(String[] args) {
        TreeMap<Employee, String> treeMap = new TreeMap<>();

        Employee employee1 = new Employee(1, "Olexander");
        Employee employee2 = new Employee(5, "Olexander");
        Employee employee3 = new Employee(3, "Makar");

        treeMap.put(employee1, "Ukraine");
        treeMap.put(employee2, "Germany");
        treeMap.put(employee3, "Paris");

        System.out.println(treeMap);
        System.out.println(treeMap.headMap(employee3));
        System.out.println(treeMap.tailMap(employee3));

    }
}
