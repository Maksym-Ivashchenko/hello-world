package ua.goit.module5;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFileExample {
    private static final String ABSOLUTE_PATH = "src/main/resources/out/SomeFile1.txt";

    public static void main(String[] args) {
        File file = new File(ABSOLUTE_PATH);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
        }

        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file))) {
            String content = "This we will add to a file\nHello World!!!\n111";
            bufferedOutputStream.write(content.getBytes());

        } catch (IOException e) {
            System.err.println("EXEPTION!!!!" + e.getMessage());

        }
    }
}
