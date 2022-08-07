package ua.goit.module9homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static ua.goit.module9homework.ReaderFromFile.checkIfFileAvailable;

public class SortedWords {
    private static final String ABSOLUTE_PATH = "src/main/resources/word.txt";
    private static List<String> list = new ArrayList<>();
    private static Set<String> uniqueWord = new HashSet<>();


    public static void main(String[] args) {

        File fileInput = new File(ABSOLUTE_PATH);

        checkIfFileAvailable(fileInput);

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
        for (String name : list) {
            if (!name.isBlank()) uniqueWord.add(name);
        }
//        System.out.println(uniqueWord);
        print();


    }

    public static void print() {
        for (String s : uniqueWord) {
            int i = 1;
            Word words = new Word(s, i);
            for (String s1 : list) {
                if (s.equals(s1)) words.setCount(i++);
            }
            System.out.println((s + "\s" + words.getCount()));
        }
    }
}

class Word {
    private String word;
    private int count;

    public Word(String word, int count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
