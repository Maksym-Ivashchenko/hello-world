package ua.goit.module9homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ParserPhoneNumber {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/main/resources/text.txt");
        List<String> result = Files.readAllLines(path);
        System.out.println(result);

        Files.write(Paths.get("src/main/resources/newtext.txt"), result);
        parsPhoneNumber(result);
    }

    private static void parsPhoneNumber(List<String> result) {
        String regex1 = "\\d{3}-\\d{3}-\\d{4}";
        String regex2 = "\\(\\d{3}\\)\\s\\d{3}-\\d{4}";

        for (String s : result) {
            if (!s.isEmpty() & s.matches(regex1) || s.matches(regex2)) {
                System.out.println(s);
            }
        }
    }
}
