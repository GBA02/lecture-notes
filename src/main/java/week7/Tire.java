package week7;

public class Tire implements Comparable<Tire> {

    private String name;
    private double price;
    private int warrantyMiles;

    public Tire(String tire, double price, int warrantyMiles) {
        this.name = tire;
        this.price = price;
        this.warrantyMiles = warrantyMiles;
    }

    public double pricePer1000Miles() {
        double pricePer1000 = (this.price / this.warrantyMiles) * 1000;
        return pricePer1000;
    }

    public double costForSet() {
        return this.price * 4;
    }

    @Override
    public String toString() {
        double pricePer1000 = pricePer1000Miles();
        return String.format("%s costs $%.2f per tire. Cost per 1000 miles is $%.2f.",
                this.name, this.price, pricePer1000);
    }

    @Override
    public int compareTo(Tire anotherTire) {
        return Double.compare(this.pricePer1000Miles(), anotherTire.pricePer1000Miles());
//        return this.name.compareTo(anotherTire.name());
    }
}
