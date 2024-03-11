package week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingVariables {
    public static void main(String[] args) throws IOException {

        int classCode = 2454;
        double averageEnrollment = 22.16; // average number of students in a semester
        String className = "Java";

        FileWriter writer = new FileWriter("java.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write("The class name is " + className + "\n");
        bufferedWriter.write("The class code is " + classCode + "\n");
        bufferedWriter.write("The average enrollment is " + averageEnrollment + " students.\n");


        bufferedWriter.close(); // you can do either!
//        writer.close(); //this works too

    }
}
