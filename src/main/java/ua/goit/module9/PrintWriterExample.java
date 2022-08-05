package ua.goit.module9;

import java.io.PrintWriter;

public class PrintWriterExample {

    public static void main(String[] args) {
        try(PrintWriter printWriter = new PrintWriter(System.out)) {
            printWriter.println("Hello");
            printWriter.println("World");
        }
    }
}
