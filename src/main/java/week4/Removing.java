package week4;

import java.util.ArrayList;
import java.util.List;

public class Removing {
    public static void main(String[] args) {

        List<String> classNames = new ArrayList<>();
        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");

        System.out.println(classNames);

        classNames.remove("Project Management");
        System.out.println(classNames);

        classNames.remove(0);
        System.out.println(classNames);

        String search = "C# Programming";
        if (classNames.contains(search)){
            System.out.println("The list does not contain " + search);
        }else {
            System.out.println("The list does NOT contain " + search);
        }

        for (String name: classNames){
            System.out.println(name);
        }
        System.out.println();

        for (int x = 0; x< classNames.size(); x++){
            System.out.println(classNames.get(x));
        }

    }
}
