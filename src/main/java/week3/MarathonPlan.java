package week3;

public class MarathonPlan {
    public static void main(String[] args) {
        int currentWeek = 1;
        double distanceTotal = 0;
        double targetDistance = 26.2;
        double percentIncrease = 1.1;
        // loop until the currentDistance is greater than targetDistance
        for (double currentDistance = 1; currentDistance <= targetDistance; ) {
            System.out.println("Week " + currentWeek + " your distance is " + currentDistance); // prints out week by week
            currentDistance = currentDistance * percentIncrease; // increases currentDistance by set amount
            distanceTotal = currentDistance;
            currentWeek += 1;

        }
        System.out.printf("By week %d you should be able to run %.2f", currentWeek, distanceTotal);

    }
}
