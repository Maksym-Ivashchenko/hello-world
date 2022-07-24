package ua.goit;

import java.util.Arrays;
import java.util.Comparator;

public class Main1 {
    public static void main(String[] args) {
        People[] peoples = new People[3];
        peoples[0] = new People("name3", "surname3", 35);
        peoples[1] = new People("name2", "surname2", 25);
        peoples[2] = new People("name1", "surname1", 45);

        Arrays.sort(peoples);
        System.out.println(Arrays.toString(peoples));
        Arrays.sort(peoples, new PeopleComparatorAge());
        System.out.println(Arrays.toString(peoples));
        Arrays.sort(peoples, new PeopleComparatorName());
        System.out.println(Arrays.toString(peoples));

    }
}

class PeopleComparatorAge implements Comparator<People> {

    @Override
    public int compare(People o1, People o2) {
        return Integer.compare(o1.getAge(),o2.getAge());
    }
}

class PeopleComparatorName implements Comparator<People> {

    @Override
    public int compare(People o1, People o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
