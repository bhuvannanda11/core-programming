import java.util.*;

public class TeamBmiCalculatorQ1L3 {
    
    // Method to calculate BMI and status
    public static String[][] calculateBMI(double[][] data) {
        int numPersons = data.length;
        String[][] bmiResults = new String[numPersons][4];
        
        for (int i = 0; i < numPersons; i++) {
            double weight = data[i][0];
            double heightMeters = data[i][1] / 100.0; // Convert cm to meters
            double bmi = weight / (heightMeters * heightMeters);
            bmi = Math.round(bmi * 100.0) / 100.0; // Round to 2 decimal places
            
            String status;
            if (bmi <= 18.4) {
                status = "Underweight";
            } 
            else if (bmi >=18.5 && bmi<= 24.9) {
                status = "Normal weight";
            } 
            else if (bmi >=25.0 && bmi<= 39.9) {
                status = "Overweight";
            } 
            else {
                status = "Obese";
            }
            
            bmiResults[i][0] = String.valueOf(weight);
            bmiResults[i][1] = String.valueOf(data[i][1]);
            bmiResults[i][2] = String.valueOf(bmi);
            bmiResults[i][3] = status;
        }
        return bmiResults;
    }
    
    // Method to display BMI results
    public static void displayResults(String[][] bmiResults) {
        System.out.printf("%-10s%-10s%-10s%-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        System.out.println("---------------------------------------------------");
        
        for (String[] person : bmiResults) {
            System.out.printf("%-10s%-10s%-10s%-15s\n", person[0], person[1], person[2], person[3]);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double data[][] = new double[10][2];
        
        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            data[i][1] = sc.nextDouble();
        }
        
        String[][] bmiResults = calculateBMI(data);
        displayResults(bmiResults);
        
        sc.close();
    }
}