import java.util.Scanner;

public class CollinearL3 {

    // Method to check if the points are collinear using the slope formula
    private static boolean areCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the slopes between the points
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        // The points are collinear if the slopes are equal
        return (slopeAB == slopeBC && slopeBC == slopeAC);
    }

    // Method to check if the points are collinear using the area of triangle formula
    private static boolean areCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the area of the triangle formed by the three points
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        // The points are collinear if the area is 0
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take inputs for the three points
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();
        System.out.print("Enter x3: ");
        double x3 = sc.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = sc.nextDouble();

        // Check if the points are collinear using slope formula
        if (areCollinearUsingSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear using the slope formula.");
        } else {
            System.out.println("The points are not collinear using the slope formula.");
        }

        // Check if the points are collinear using the area of triangle formula
        if (areCollinearUsingArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear using the area of triangle formula.");
        } else {
            System.out.println("The points are not collinear using the area of triangle formula.");
        }

        sc.close();
    }
}