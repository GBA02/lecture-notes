package week1;

import static input.InputUtils.positiveIntInput;
import static input.InputUtils.stringInput;

public class HelloInput {
    public static void main(String[] args) {
        String userName = stringInput("Please enter your name: ");
        System.out.println("Hello " + userName + "!");

        int numberOfClasses = positiveIntInput("How many classes are you taking?");

        String units = "classes";

        if (numberOfClasses == 1) {
            units ="class";
        }

        System.out.println("You are taking " + numberOfClasses + " " + units + " this semester.");
        System.out.printf("You are taking %d %s this semester.", numberOfClasses, units);

    }
}
