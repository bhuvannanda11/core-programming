import java.util.*;
public class BMICalculator2DL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        double personData[][] = new double[n][3]; 
        // Stores weight, height, and BMI
        String weightStatus1[] = new String[n];

        for (int i = 0; i < n; i++) {
            double weight1;
            double height1;
            
            // Input for weight
            do {
                System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
                weight1 = sc.nextDouble();
            } while (weight1 <= 0);

            // Input for height
            do {
                System.out.print("Enter height (m) of person " + (i + 1) + ": ");
                height1 = sc.nextDouble();
            } while (height1 <= 0);

            double bmi1 = weight1 / (height1 * height1);
            
            personData[i][0] = weight1;
            personData[i][1] = height1;
            personData[i][2] = bmi1;

            if (bmi1 <= 18.4) {
                weightStatus1[i] = "Underweight";
            } else if (bmi1 >= 18.5 && bmi1 < 24.9) {
                weightStatus1[i] = "Normal weight";
            } else if (bmi1 >= 25.0 && bmi1 < 39.9) {
                weightStatus1[i] = "Overweight";
            } else {
                weightStatus1[i] = "Obese";
            }
        }

        System.out.println("BMI Report: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ":");
            // String.format("%.2f", variable) to format num till 2 decimal spaces
            System.out.println("  Height = " + String.format("%.2f", personData[i][0]) + " m");
            System.out.println("  Weight = " + String.format("%.2f", personData[i][1]) + " kg");
            System.out.println("  BMI = " + String.format("%.2f", personData[i][2]));
            System.out.println("  Status = " + weightStatus1[i]);
            System.out.println(); // Adding blank line for separation
        }


        sc.close();
    }
}
