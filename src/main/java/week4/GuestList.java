package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static input.InputUtils.stringInput;
import static input.InputUtils.yesNoInput;

public class GuestList {
    public static void main(String[] args) {

        Random rnd = new Random();
        int randomNumber = rnd.nextInt(10); //0-9
        int numFrom1To19 = rnd.nextInt(10) + 1;  // 1-19
        System.out.println(randomNumber + " " + numFrom1To19);

        List<String> guestList = new ArrayList<>();

        while (true) {
            String guestInput = stringInput("Please type a guest name, or press Enter to quit");

            if (guestInput.isEmpty()) {
                break;
            }
            if (containsInput(guestList, guestInput)) {
                System.out.println(guestInput + " is already on the list, try something else please,");
            } else {
                guestList.add(guestInput);
            }

        }
        Collections.sort(guestList);
        System.out.println("Here are the names you've entered so far:");

        for (String guestName : guestList) {
            System.out.println(guestName);
        }
        boolean removeOrNot = yesNoInput("Would you like to remove any names?");
        while (removeOrNot) {
            if (guestList.isEmpty()) {
                System.out.println("List is already empty,");
            }

            String removeName = stringInput("Enter a name to remove(press Enter to quit)");
            if (removeName.isEmpty()) {
                break;
            }

            if (containsInput(guestList, removeName)) {
                guestList.remove(removeName);
                System.out.println(removeName + " has successfully been removed.");
                System.out.println(guestList);
            } else {
                System.out.println(removeName + " does not seem to be in the list, try something else.");
            }
        }
        System.out.println("Your final list of name is:");
        for (String name: guestList){
            System.out.println(name);
        }
        System.out.println("Goodbye!");

    }

    private static boolean containsInput(List<String> guestList, String input) {
        for (String name : guestList) {
            if (name.equalsIgnoreCase(input)) {
                return true;
            }
        }
        return false;
    }
}
