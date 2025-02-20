import java.util.*;
public class UnitConverter01L2 {
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;  
        return (km * km2miles);
    }


    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;  
        return (miles * miles2km);
    }


    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;  
        return (meters * meters2feet);
    }


    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;  
        return (feet * feet2meters);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double miles = sc.nextDouble();
        double meters = sc.nextDouble();
        double feet = sc.nextDouble();

        System.out.println(km+" kilometers is equal to "+convertKmToMiles(km)+" miles");
        System.out.println(miles + " miles is equal to " + convertMilesToKm(miles) + " kilometers");

        sc.close();

    }
}
