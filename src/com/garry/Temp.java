package com.garry;

public class Temp {
    public static void main(String[] args) {

        // String and int variables to store data
        String currentMonth = "January";
        int dayOfMonth = 11;

        // Double variables to store the high and low temps that may contain float numbers
        double forecastHigh = 19.4;
        double forecastLow = -3.7;

        // Calculation to find the difference
        double tempDiff = forecastHigh - forecastLow;

        //output
        System.out.printf("On %s %d, The difference between the high and low temperatures is %.1fF",
                currentMonth, dayOfMonth, tempDiff);
    }
}
