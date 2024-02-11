package week2;

import java.util.Arrays;

import static input.InputUtils.stringInput;

public class LoopGetDataForArray {
    public static void main(String[] args) {
        String[] textbooks = new String [5];

        for (int number = 0; number < textbooks.length; number++){
            //Get data about one book from user
            String bookName = stringInput("Please enter name of textbook");

            //Using loop counter to write to each array element in turn
            textbooks[number] = bookName;
        }
        System.out.println("Thank you : here is the data you entered");
        for (int number = 0; number < textbooks.length; number++){
            System.out.println("Book number " + (number+1) + " is " + textbooks[number]);
        }
    }
}
