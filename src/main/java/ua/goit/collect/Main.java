package ua.goit.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

       List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int size = list.size();
        Integer e1 = list.get(0);

//        for (int i = 0; i < list.size(); i++) {
//            String get = list.get(i);
//            System.out.println(get);
//        }
//        for (String s :
//                list) {
//            System.out.println(s);
//        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
        }

        ListIterator<Integer> listIterator = list.listIterator();
        Integer[] integers = list.toArray(new Integer[(list.size())]);
    }
}
