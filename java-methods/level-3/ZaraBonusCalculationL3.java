import java.util.*;

public class ZaraBonusCalculationL3 {


    // Method to generate random salary and years of service for each employee
    private static void generateEmployeeData(double[][] data) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < data.length; i++) {
            // Random salary between 10,000 and 99,999
            data[i][0] = 10000 + sc.nextInt(90000);
            // Random years of service between 1 and 15
            data[i][1] = 1 + sc.nextInt(15);
        }
        sc.close();
    }

    // Method to calculate the bonus and new salary based on years of service
    private static double[][] calculateBonusAndNewSalary(double[][] data) {
        double[][] updatedData = new double[data.length][3]; // [][0] -> Old Salary, [][1] -> Years of Service, [][2] -> Bonus & New Salary
        for (int i = 0; i < data.length; i++) {
            double oldSalary = data[i][0];
            double yearsOfService = data[i][1];
            double bonus = 0;
            double newSalary = oldSalary;

            // Calculate the bonus
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05; // 5% bonus
            } else {
                bonus = oldSalary * 0.02; // 2% bonus
            }

            // Calculate the new salary
            newSalary = oldSalary + bonus;

            // Store old salary, years of service, and new salary with bonus in the updatedData array
            updatedData[i][0] = oldSalary;
            updatedData[i][1] = yearsOfService;
            updatedData[i][2] = newSalary;
        }
        return updatedData;
    }

    // Method to calculate and display the sum of old salary, new salary, and total bonus
    private static void displayResults(double[][] oldData, double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Employee Bonus and Salary Details:");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-10s %-20s %-15s %-15s %-15s\n", "Employee", "Old Salary", "Years of Service", "New Salary", "Bonus");

        // Print details for each employee and accumulate totals
        for (int i = 0; i < oldData.length; i++) {
            double oldSalary = oldData[i][0];
            double yearsOfService = oldData[i][1];
            double newSalary = updatedData[i][2];
            double bonus = newSalary - oldSalary;

            // Accumulate totals
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            // Print the details of each employee
            System.out.printf("%-10d %-20.2f %-15.0f %-15.2f %-15.2f\n", i + 1, oldSalary, yearsOfService, newSalary, bonus);
        }

        // Display total old salary, total new salary, and total bonus
        System.out.println("--------------------------------------------------");
        System.out.printf("%-10s %-20.2f %-15s %-15.2f %-15.2f\n", "Total", totalOldSalary, "", totalNewSalary, totalBonus);
    }

    public static void main(String[] args) {
        // Number of employees
        final int NUM_EMPLOYEES = 10;

        // Create a 2D array to store the salary and years of service
        double[][] employeeData = new double[NUM_EMPLOYEES][2]; // [][0] -> Salary, [][1] -> Years of Service

        // Generate random salary and years of service for each employee
        generateEmployeeData(employeeData);

        // Calculate the new salary and bonus, and store it in a new 2D array
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);

        // Calculate and display the sum of old salary, new salary, and total bonus
        displayResults(employeeData, updatedData);
    }
}
