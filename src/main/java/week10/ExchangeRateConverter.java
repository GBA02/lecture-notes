package week10;

import kong.unirest.Unirest;
import java.util.Map;
import static input.InputUtils.doubleInput;

public class ExchangeRateConverter {
    public static void main(String[] args) {
        String url = "https://1150-exchange-rates.azurewebsites.net/latest";
        Map<String, Object> queryParameters = Map.of("base", "USD", "symbols", "EUR");

        RateResponse response =
                Unirest.get(url)
                        .queryString(queryParameters)
                        .asObject(RateResponse.class)
                        .getBody();

        double rate = response.rates.EUR;
        String dateRequested = response.date;
        String base = response.base;

        double amountOfDollars = doubleInput("How many US Dollars to convert Euros?");
        double euroEquivalent = amountOfDollars * amountOfDollars;
        System.out.println("On " + dateRequested + " the exchange rate from " + base + " to Euros is " + rate);
        System.out.println("$" + amountOfDollars + " is equivalent to " + euroEquivalent);
    }
}

class RateResponse{
    public String base;
    public String date;
    public Rates rates;
}

class Rates {
    public double EUR;
}
