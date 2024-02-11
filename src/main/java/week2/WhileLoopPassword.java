package week2;

import static input.InputUtils.stringInput;

public class WhileLoopPassword {
    public static void main(String[] args) {
        String secretPassword = "kittens";

        System.out.println();
        String userPassword = stringInput("Enter the password");

        // Always use the .equals() method to check if two Strings have the exact same characters

        int maxGuesses = 5;

        // Before we let user in, we need to check that the password is correct
        //This loop will repeat while the password is not "kittens", our secretPassword
        while (!userPassword.equals(secretPassword) && maxGuesses > 1) {
            // The user got the password wrong. Print an error message
            System.out.println("Password incorrect, access denied!");
            // And ask user to try again.
            System.out.println("Try again");
            // Replace userPassword with user's next attempt.
            userPassword = stringInput("Enter the password");
            maxGuesses--;


            // If user gets it wrong again, repeats the loop
        }

        if (maxGuesses > 1) {
            System.out.println("Correct password - access granted");
            // top secret program here!
        } else {
            System.out.println("Max number of password attempts");
            System.exit(0);
        }


    }
}
