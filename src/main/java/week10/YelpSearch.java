package week10;

import kong.unirest.Unirest;

import java.util.Map;

import static input.InputUtils.stringInput;

public class YelpSearch {
    public static void main(String[] args) {
        String yelpURL = "https://api.yelp.com/v3/businesses/search";
        String yelp_API_key = System.getenv("YELP_API_KEY");

        String typeOfRestaurant = stringInput("What type of restaurant would you like to search for? ");
        Map<String, Object> yelpQuery = Map.of("location", "Mnneapolis,MN",
                "term", typeOfRestaurant, // type of restaurant
                "categories", "restaurants",
                "price", "1"); // lowest price
        YelpResponse response = Unirest
                .get(yelpURL)
                .header("Authorization", "Bearer " + yelp_API_key)
                .queryString(yelpQuery)
                .asObject(YelpResponse.class).getBody();
        System.out.println(response);
        for (Business b : response.businesses){
            System.out.println(b.name);
            System.out.println(b.rating);
            System.out.println(b.location.address1 + ", " + b.location.city);
        }
    }
}

