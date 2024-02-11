package week1;

import static input.InputUtils.doubleInput;

public class AboveFreezing {
    public static void main(String[] args) {
        double temp = doubleInput("Enter today's temperature in F");

        if (temp > 32) {
            System.out.println("It's above freezing");
        } else {
            System.out.println("It's below freezing");
        }
    }
}
