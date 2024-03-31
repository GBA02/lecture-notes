package week7;

public class Pool {

    private String name; // field, or a variable
    private double length; // another field

    Pool(String name, double length) {
        this.name = name;
        this.length = length;
    }

    // instance method
    // Instance is another word for an object,
    // an instance of a class
    // A Pool object is an instance of the
    public double distanceForLaps(int laps){
        // 10 laps of pool of length 50, that's 500 meters.

        double total = laps * this.length;
        return total;
    }

    @Override
    public String toString() {
        String description = this.name + " pool is " + length + " meters long.";
        return description;

    }

}
