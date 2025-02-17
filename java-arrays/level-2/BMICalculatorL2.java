import java.util.*;
public class BMICalculatorL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numPersons = sc.nextInt();

        double weight[] = new double[numPersons];
        double height[] = new double[numPersons];
        double bmi[] = new double[numPersons];
        String weightStatus[] = new String[numPersons];

        for(int i = 0; i < numPersons; i++){
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            weight[i] = sc.nextDouble();
            System.out.print("Enter height (m) of person " + (i + 1) + ": ");
            height[i] = sc.nextDouble();

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4) {
                weightStatus[i] = "Underweight";
            } 
            else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                weightStatus[i] = "Normal weight";
            } 
            else if (bmi[i] >= 25.0 && bmi[i] < 39.9) {
                weightStatus[i] = "Overweight";
            } 
            else{
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("BMI Report:");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            // String.format("%.2f", variable) to format num till 2 decimal spaces
            System.out.println("  Height = " + String.format("%.2f", height[i]) + " m");
            System.out.println("  Weight = " + String.format("%.2f", weight[i]) + " kg");
            System.out.println("  BMI = " + String.format("%.2f", bmi[i]));
            System.out.println("  Status = " + weightStatus[i]);
            System.out.println(); // Adding blank line for separation
}


        sc.close();
    }
}
