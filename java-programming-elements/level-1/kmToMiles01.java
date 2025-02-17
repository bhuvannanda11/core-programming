import java.util.*;
public class KmToMiles01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double km = 10.8;

        double miles = km / 1.6;      // 1km = 1.6miles

        System.out.println("The distance "+km+" in miles is "+miles);
    }
}
