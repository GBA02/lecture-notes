package week2;

public class ArrayExamples {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 4;
        numbers[1] = 100;
//        numbers[5] = 3;

        String[] classNames = {"Java", "C#", "Web", "Android", "ios"};
//        classNames[0] = "Java";
//        classNames[1] = "C#";
//        classNames[2] = "Web";

        System.out.println("One of the second year classes is " + classNames[2]);

        int numberOfClasses = classNames.length;
        System.out.println("There are " + numberOfClasses + " classes.");

        for (int x = 0; x < classNames.length; x++) { // print all the classes
            System.out.println("A class name is " + classNames[x]);
        }
    }
}
