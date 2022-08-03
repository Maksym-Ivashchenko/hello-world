package ua.goit.module7;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {
        Map<String,String> capitals = new HashMap<>();
        //добавление элемента в мэп
        capitals.put("Germany", "Berlin");
        capitals.put("Ukraine", "Kyiv");
        capitals.put("England", "London");

        //получение по ключу
        String ukraine = capitals.get("Ukraine");
        System.out.println("Ukraine capital is " + ukraine);

        //удаление элемента
        capitals.remove("England");
        System.out.println(capitals);

        System.out.println("Size " + capitals.size());

        Set<String> keySet = capitals.keySet();
        System.out.println(keySet);

        Collection<String> values = capitals.values();
        System.out.println(values);

        Set<Map.Entry<String, String>> entries = capitals.entrySet();
        for (Map.Entry<String, String> entry :
                entries) {
            System.out.println("Entries");
            System.out.println("Key " + entry.getKey());
            System.out.println("Value " + entry.getValue());
        }
    }
}
