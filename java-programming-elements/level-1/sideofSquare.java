import java.util.*;
public class sideofSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the perimeter :");
        double perimeter = sc.nextDouble();
        double side = perimeter/4;

        System.out.println("The length of side is "+side+" whose perimeter is "+perimeter);

    }
}
