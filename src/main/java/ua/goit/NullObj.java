package ua.goit;

import java.util.Optional;

public class NullObj {

    public static Optional<String> test(String name) {
        switch (name) {
            case ("a") : return Optional.of("1");
            case ("b") : return Optional.of("2");
            case ("c") : return Optional.of("3");
            default : return Optional.empty();
        }
    }

    public static void main(String[] args) {
        test("d");
    }
}
