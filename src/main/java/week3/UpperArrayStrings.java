package week3;

import java.util.Arrays;

public class UpperArrayStrings {
    public static void main(String[] args) {
        String[] sponsors = {"Ikea", "at&t", "cvs", "3m"};

        for (int x = 0; x< sponsors.length; x++){
            sponsors[x] = sponsors[x].toUpperCase();
        }
        System.out.println(Arrays.toString(sponsors));
    }
}
