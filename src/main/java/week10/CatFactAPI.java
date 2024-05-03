package week10;

import kong.unirest.Unirest;

public class CatFactAPI {
    public static void main(String[] args) {
        String url = "https://catfact.ninja/fact";
        CatFact catFact = Unirest.get(url).asObject(CatFact.class).getBody();
        String fact = catFact.fact;
        System.out.println("A cat fact is:\n" + fact);
        int length = catFact.length;
        System.out.println("The length of this fact is " + length + " characters long");
    }

}

class CatFact{
    public String fact;
    public int length;

}
