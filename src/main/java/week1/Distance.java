package week1;

import static input.InputUtils.positiveDoubleInput;

public class Distance {
    public static void main(String[] args) {
        double distanceInMiles = positiveDoubleInput("What is the distance" +
                " between your home and MCTC in miles.");

        double distanceInKilometers = 1.6 * distanceInMiles;

        System.out.printf("Your home is %.1f kilometers away from MCTC.\n", distanceInKilometers);

        // does the user live more than 10 miles away?
        if (distanceInMiles > 10) {
            System.out.println("You live more than 10 miles from MCTC.");
        } else if (distanceInMiles == 10) {
            System.out.println("You live exactly 10 miles from MCTC.");
        } else {
            System.out.println("You live less than 10 miles away from MCTC.");
        }
    }
}
