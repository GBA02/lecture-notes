package week2;

import static input.InputUtils.doubleInput;

public class BusExpenseCalc {
    public static void main(String[] args) {
        String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        double totalSpent = 0;

        for (int day = 0; day < dayNames.length; day++) {
            double amountSpentInput = doubleInput("On " + dayNames[day] +
                    ", what did you spend on bus fares");
            totalSpent += amountSpentInput;
        }
        System.out.printf("For the week, you spent $%.2f for bus fares.", totalSpent);
    }
}
