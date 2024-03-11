package week5;

import java.util.HashMap;
import java.util.Map;

public class ClassCodes {
    public static void main(String[] args) {
        Map<Integer, String> classCodes = new HashMap<>();
        classCodes.put(2545, "Java");
        classCodes.put(1425, "Datacom");
        classCodes.put(2560, "Web");


        for (Integer key: classCodes.keySet()){
            String className = classCodes.get(key);
            System.out.println("ITEC " + classCodes + " " + className);
        }

        System.out.println("I am taking " + classCodes.size() + " classes");
        int numberOfClasses = classCodes.size();

        int searchCode = 2417;

        if (classCodes.containsKey(searchCode)){
            System.out.println("Class name is " + classCodes.get(searchCode));
        }else {
            System.out.println("Not found");
        }

        int searchCode2 = 2545;

        String className = classCodes.get(searchCode2);
        if (className==null){
            System.out.println("not found");
        }else {
            System.out.println("This class is found in the HashMap. The class name is " + className);
        }
    }
}
