package week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HelloReading {
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("hello.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

    }
}
