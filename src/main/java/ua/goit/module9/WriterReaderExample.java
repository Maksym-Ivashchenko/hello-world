package ua.goit.module9;

import java.io.*;

public class WriterReaderExample {
    private static final String ABSOLUTE_PATH = "src/main/resources/writer/File1.txt";

    public static void main(String[] args) {

        File file = new File(ABSOLUTE_PATH);
        checkIfFileAvailable(file);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
            String content = "Hello World!!!\nHow are you today?\n";
            bufferedWriter.write(content);

        } catch (IOException e) {
            System.err.println("EXEPTION!!!!" + e.getMessage());

        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

//            int ch = bufferedReader.read();
//            while (ch != -1) {
//                System.out.print((char) ch);
//                ch = bufferedReader.read();
//            }
        } catch (IOException e) {
            System.err.println("EXEPTION!!!!" + e.getMessage());

        }


    }

    private static void checkIfFileAvailable(File file) {
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }
}
