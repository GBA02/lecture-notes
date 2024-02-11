package com.garry;

public class Address {
    public static void main(String[] args) {

        String city = "Minneapolis";
        String state = "mn";

        // Create a new string variable "Minneapolis, MN"
        String cityState = city + ", " + state.toUpperCase();

        System.out.println(cityState);
    }
}
