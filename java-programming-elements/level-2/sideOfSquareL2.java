import java.util.*;
public class sideOfSquareL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        double side = perimeter/4;
        System.out.println("The length of the side is " +side+" whose perimeter is "+perimeter);
    }
}
