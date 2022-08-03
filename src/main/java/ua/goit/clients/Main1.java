package ua.goit.clients;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main1 {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,2);

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            iterator.next();
        }

        System.out.println(map);

        Gson gson = new Gson();
    }
}
