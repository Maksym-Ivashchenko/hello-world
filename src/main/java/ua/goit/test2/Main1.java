package ua.goit.test2;

import java.util.Optional;

public class Main1 {

    public static void main(String[] args) {
        //Optional предполагает, что может вернуться пустой объект (null)
        Optional<String> test = test();

        String orElseGet = test.map(string -> string + " 111111111").
                orElseGet(() -> String.valueOf(new RuntimeException()));

        System.out.println(orElseGet);
    }

    public static Optional<String> test() {
        return Optional.of("dlsjfa;lkdjfkld");

    }
}
