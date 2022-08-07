package ua.goit.module9homework;

import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReaderFromFile {
    private static final String ABSOLUTE_PATH = "src/main/resources/File1.txt";

    public static void main(String[] args) {

        File fileInput = new File(ABSOLUTE_PATH);
        File fileOutput = new File("src/main/resources/user.json");

        checkIfFileAvailable(fileInput);
        List<String> list = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileInput))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] split = line.split("\\s+");
                list.addAll(Arrays.asList(split));
                line = bufferedReader.readLine();
            }
//            System.out.println(Arrays.toString(list.toArray()));
        } catch (IOException e) {
            System.err.println("EXCEPTION!!!!" + e.getMessage());
        }
        List<User> userList = new LinkedList<>();
        for (int i = 2; i < list.size(); i = i + 2) {
            userList.add(new User(list.get(i), Integer.parseInt(list.get(i + 1))));
        }
//        System.out.println(userList);
        Gson gson = new Gson();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileOutput))) {
            bufferedWriter.write(gson.toJson(userList));

        } catch (IOException e) {
            System.err.println("EXCEPTION!!!!" + e.getMessage());
        }


    }

    static void checkIfFileAvailable(File file) {
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
