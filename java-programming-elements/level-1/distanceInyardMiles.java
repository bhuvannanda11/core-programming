import java.util.*;
public class DistanceInyardMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the distance in feet :");
        double distanceInFeet = sc.nextDouble();

        double distanceInyard = distanceInFeet / 3;     // 1 yard is 3 feet
        double distanceInMiles = distanceInyard / 1760;  //1 mile = 1760 yards

        System.out.println("The distance in yards is "+distanceInyard+" and in miles is "+distanceInMiles);

        sc.close();
    }
}
