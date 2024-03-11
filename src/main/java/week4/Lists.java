package week4;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Garry");
        arrayList.add("MCTC");
        for (String s:arrayList){
            System.out.println(s.toUpperCase() + " length of " + s.length());
        }
        System.out.println(arrayList.get(1));

    }
}
