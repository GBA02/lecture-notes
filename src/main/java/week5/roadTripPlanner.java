package week5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static input.InputUtils.positiveIntInput;

public class roadTripPlanner {
    public static void main(String[] args) {
        Map<String, Integer> citiesDistance = new HashMap<>();
        citiesDistance.put("Duluth", 154);
        citiesDistance.put("Brainerd", 127);
        citiesDistance.put("Stillwater", 26);
        citiesDistance.put("Ely", 245);
        citiesDistance.put("Red Wing", 54);
        int maxDist = positiveIntInput("What is the furthest you would want to drive?");

        List<String> citiesInRange = new ArrayList<>();

        for (String city : citiesDistance.keySet()) {
            int distToCity = citiesDistance.get(city);
            if (distToCity <= maxDist) {
                citiesInRange.add(city);
//                System.out.printf("%s is %d miles away.", city, distToCity);
            }
        }

        if (citiesInRange.isEmpty()){
            System.out.println("Sorry, no Minnesota cities are within your driving distance");
        }else{
            System.out.println("Here are the cities you can drive to.");
            for (int x = 0; x<citiesInRange.size(); x++){
                System.out.printf("City number %d. %s\n", x+1, citiesInRange.get(x));
            }
        }

    }
}
