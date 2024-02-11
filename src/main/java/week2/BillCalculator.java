package week2;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class BillCalculator {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April",
                "May", "June", "July", "August", "September", "October",
                "November", "December"};
        double[] billForMonths = new double[months.length];
        double billSum = 0;
        for (int monthNum = 0; monthNum < months.length; monthNum++) {
            double billInput = doubleInput("What was the bill for " + months[monthNum] + "?");
            billForMonths[monthNum] = billInput;
            billSum += billInput;
        }
        double billAverage = billSum / 12;
        System.out.println("Here is the display of the bill amount for each month:");
        for (int monthNum = 0; monthNum < months.length; monthNum++) {
            System.out.printf("Your bill for %s will be $%.2f.\n", months[monthNum], billForMonths[monthNum]);
        }
        System.out.printf("The total will be $%.2f and the average per month was $%.2f", billSum, billAverage);

    }
}
