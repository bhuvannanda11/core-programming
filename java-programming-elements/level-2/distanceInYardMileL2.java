import java.util.*;
public class distanceInYardMileL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        
        double distanceInFeet = sc.nextDouble();
        double distanceInYard = distanceInFeet / 3;       // 1 yard is 3 feet
        double distanceInMiles = distanceInYard / 1760;   //1 mile = 1760 yards
        System.out.println("The distance in yards is "+distanceInYard+" and in miles is "+distanceInMiles);

        sc.close();
    }    
}
