package ua.goit.module7;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2) {
                    return 1;
                } if (o1 > o2) {
                    return -1;
                }
                return 0;
            }
        });

        treeMap.put(3, "val");
        treeMap.put(2, "val");
        treeMap.put(1, "value");
        treeMap.put(5, "asd");
        treeMap.put(8, "value");
        treeMap.put(7, "value");

        System.out.println(treeMap);

        SortedMap<Integer, String> headMap = treeMap.headMap(5);
        System.out.println(headMap);

        SortedMap<Integer, String> tailMap = treeMap.tailMap(5);
        System.out.println(tailMap);
    }
}
