package ua.goit.module5;

import java.io.FileNotFoundException;
import java.util.Objects;

public class ExceptionsLecture {
    public static void main(String[] args) {

//        try {
//            method1("SomeText");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
try {
    castToNumber("23");
} catch (IncorrectNumberFormatException exception) {
    System.out.println("You passed wrong number, try again");
} finally {
    System.out.println();
}
    }

    private static void method1(String someText) throws FileNotFoundException, ClassNotFoundException {
        if (Objects.isNull(someText)) {
            throw new ClassNotFoundException();
        }
        throw new FileNotFoundException("File with name: " + someText + " not found");
    }

    private static void method2() {
        throw new RuntimeException("Some problems");
    }

    private static void castToNumber(Object o) {
        if (o instanceof Integer) {
            System.out.println((Integer)o);
        } else {
            throw new IncorrectNumberFormatException("o object should instanceof Integer class");
        }
    }
}
