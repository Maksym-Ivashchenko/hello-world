package ua.goit.module9;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class OutputStreamWriterDemo {

    public static void main(String[] args) {
        try(ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
            OutputStreamWriter writer = new OutputStreamWriter(byteArray)) {
            writer.write("My name is Maksim");
            writer.flush();

            System.out.println(Arrays.toString(byteArray.toByteArray()));

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
