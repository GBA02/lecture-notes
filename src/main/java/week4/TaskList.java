package week4;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.stringInput;

public class TaskList {
    public static void main(String[] args) {
        List<String> todoList = new ArrayList<>();

        while (true) {
            String data = stringInput("Please type a task you need to do, or press Enter to quit");
            if (data.isEmpty()) {
                break;
            }
            if (!containsIgnoreCase(todoList, data)){
                todoList.add(data);
            }else {
                System.out.println(data + " is already in list, try something else");
            }
        }
        System.out.println("Thank you, here are the " + todoList.size() +" tasks you entered:");

        for (String input : todoList) {
            System.out.println(input);
        }
    }

    public static boolean containsIgnoreCase(List<String> list, String data){
        for(String item: list){
            if (item.equalsIgnoreCase(data)){
                return true;
            }
        }
        return false;
    }
}
