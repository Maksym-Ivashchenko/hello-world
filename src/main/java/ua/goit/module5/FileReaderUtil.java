package ua.goit.module5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderUtil {
    public static void main(String[] args) {
        fileRead("src/main/resources/SomeFile.txt");
    }

    private static void fileRead(String filePath) {
        File file = new File(filePath);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            System.out.println(reader.readLine());
        } catch (IOException e){
            System.out.println("Impossible to read file");
        }
    }
}
