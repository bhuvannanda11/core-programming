import java.util.*;
public class Conversion_of_distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1km = 1.6miles
        System.out.println("Enter the number of kilometers");
        double kilometers = sc.nextFloat();

        double miles = kilometers * 1.6f;
        System.out.println("The distance "+kilometers+" in miles is :"+miles);

        sc.close();
    }
}
