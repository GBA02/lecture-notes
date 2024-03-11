package week6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWriting {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("hello.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        // file will be created if it does not exist
        // file will be overwritten if it does exist!
        bufferedWriter.write("Hello!");
        bufferedWriter.newLine();
        bufferedWriter.write("Hello Java Students");
        bufferedWriter.newLine();
        bufferedWriter.write("Goodbye");
        bufferedWriter.newLine();

        bufferedWriter.close(); // don't forget!

        FileWriter writer2 = new FileWriter("hello.txt", true); // append flag- true means add instead of overwrite
        BufferedWriter bufferedWriter2 = new BufferedWriter(writer2);

        bufferedWriter2.write("Other data!");
        bufferedWriter2.newLine();
        bufferedWriter2.write("Hello programmers!");
        bufferedWriter2.newLine();
        bufferedWriter2.write("End of file!");
        bufferedWriter2.newLine();

        bufferedWriter2.close();

    }
}
