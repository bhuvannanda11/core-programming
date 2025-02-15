import java.util.*;
public class volumeOfEarth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radiusOfEarth = 6378;
        double pi = Math.PI;

        double volInKm3 = (4.0/3.0) * pi * Math.pow(radiusOfEarth,3);

        double km3Tomiles3 = 0.621371 * 0.621371 * 0.621371; 
        // 1km^3 = 0.621371miles^3;

        double volInmiles = volInKm3 * km3Tomiles3;

        System.out.println("The volume of earth in cubic kilometers is "+volInKm3 
        +" and cubic miles is "+volInmiles);
    }    
}
