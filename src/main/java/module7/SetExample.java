package module7;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("England");
        set.add("Ukraine");
        set.add("Ukraine");
        set.add("Ukraine");
        set.add(null);


        System.out.println(set);


        boolean isUkraineExist = set.contains("Ukraine");
        System.out.println("Is Ukraine exist? " + isUkraineExist);

        set.remove("England");

        System.out.println(set);
    }
}
