import java.util.*;
public class KmToMiles02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km;
        
        km = sc.nextDouble();
        double miles = km / 1.6;          // 1km = 1.6 miles

        System.out.println("The total miles is "+miles+" mile for the given "+km+" km");
        sc.close();
    }
}
