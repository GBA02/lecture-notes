package week2;

import static input.InputUtils.intInput;

import java.util.Random;

public class SecretNumber {
    public static void main(String[] args) {

        //Create a Random object - this iss a random number generator object
        Random random = new Random();

        int secretNumber = random.nextInt(10) + 1; //num between 1-10
        String higherLower;

        int userInput = intInput("guess a number between 1-10: ");

        while (userInput != secretNumber) {
            if (userInput > secretNumber) {
                higherLower = "lower";
            } else {
                higherLower = "higher";
            }
            userInput = intInput("Sorry, try a " + higherLower + " number: ");
        }
        System.out.println("success!");
    }
}
