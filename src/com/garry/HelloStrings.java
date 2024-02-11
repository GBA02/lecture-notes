package com.garry;

public class HelloStrings {
    public static void main(String[] args) {
        String name = "Garry";
        String nameInUpperCase = name.toUpperCase();
        System.out.println(nameInUpperCase);
        String nameInLowerCase = name.toLowerCase();
        System.out.println(nameInLowerCase);
        int charactersInName = name.length();
        System.out.println("There are " + charactersInName + " characters in your name.");
    }
}