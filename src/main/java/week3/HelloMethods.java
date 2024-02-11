package week3;

import static input.InputUtils.stringInput;

public class HelloMethods {
    public static void main(String[] args) {
        String name = stringInput("Please enter your name:");
        String greeting = makeGreeting(name);
        System.out.println(greeting);
    }

    public static String makeGreeting(String n) {
        String greeting = "Hello " + n + "!";
        return greeting; // return or output the message
    }
}
