import java.util.Scanner;

public class EuclideanDistanceL3 {

    // Method to compute the Euclidean distance between two points
    private static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        // Using Math.pow and Math.sqrt for calculating distance
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distance;
    }

    // Method to find the equation of the line given two points
    private static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        // Calculate slope (m)
        double slope = (y2 - y1) / (x2 - x1);

        // Calculate y-intercept (b)
        double intercept = y1 - slope * x1;

        // Return the slope and intercept in an array
        return new double[]{slope, intercept};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take inputs for the coordinates of two points
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Compute the Euclidean distance between the two points
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);

        // Compute the equation of the line passing through the two points
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        System.out.println("The equation of the line is: y = " + lineEquation[0] + "x + " + lineEquation[1]);

        sc.close();
    }
}
