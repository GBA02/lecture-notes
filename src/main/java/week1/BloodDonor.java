package week1;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class BloodDonor {
    public static void main(String[] args) {

        // Testing if two things are true with AND (&&)
         /* A person can be a blood donor if
        they weigh at least 110lbs and are 17 or over
         */

        System.out.println("What is your weight?");
        double weight = doubleInput();

        System.out.println("How old are you?");
        int age = intInput();

        if (weight >= 110 && age >= 17) {
            System.out.println("You are eligible to be a blood donor.");
        } else if (weight < 110 && age < 17) {
            System.out.println("Sorry, you are not eligible because " +
                    "your not old enough and you don't weigh enough.");
        } else if (weight >= 110 && age < 17){
            System.out.println("Sorry, you are not eligible because " +
                    "your not old enough.");
        } else if (weight < 110 && age >=17) {
            System.out.println("Sorry, you are not eligible because " +
                    "you don't weigh enough.");
        }
    }
}
