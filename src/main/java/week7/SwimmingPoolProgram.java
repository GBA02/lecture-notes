package week7;

public class SwimmingPoolProgram {
    public static void main(String[] args) {

        Pool ymca = new Pool("YMCA", 50);

        System.out.println(ymca);

        double totalSwam = ymca.distanceForLaps(6);
        System.out.println("The total distance is " + totalSwam + " meters");


        Pool como = new Pool("Como Park", 25);
        System.out.println(como.distanceForLaps(10));

        System.out.println(como);

        Pool edina = new Pool("Edina", 50);
        double totalDist = edina.distanceForLaps(12);
        System.out.println(totalDist);
        System.out.println(edina);
    }
}
