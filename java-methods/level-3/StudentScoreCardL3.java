import java.util.Random;
import java.util.Scanner;

public class StudentScoreCardL3 {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    private static double[][] generateRandomScores(int numStudents) {
        Random random = new Random();
        double[][] scores = new double[numStudents][3]; // 3 subjects for each student
        
        for (int i = 0; i < numStudents; i++) {
            // Generating random marks between 50 and 99 for each subject
            scores[i][0] = 50 + random.nextInt(50); // Physics
            scores[i][1] = 50 + random.nextInt(50); // Chemistry
            scores[i][2] = 50 + random.nextInt(50); // Math
        }
        return scores;
    }

    // Method to calculate the total, average, and percentage for each student
    private static double[][] calculateResults(double[][] scores) {
        double[][] results = new double[scores.length][4]; // Total, Average, Percentage, and Marks

        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2]; // Sum of PCM marks
            double average = total / 3; // Average score
            double percentage = (total / 300) * 100; // Percentage calculation (out of 300)

            // Store total, average, and percentage for each student
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Rounded to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Rounded to 2 decimal places
        }
        return results;
    }

    // Method to display the scorecard
    private static void displayScorecard(double[][] results) {
        // Header for the table
        System.out.println("Scorecard:");
        System.out.println("---------------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println("---------------------------------------------------------");

        // Display scores, total, average, and percentage for each student
        for (int i = 0; i < results.length; i++) {
            System.out.print((i + 1) + "\t"); // Display student number

            // Randomly generated scores for Physics, Chemistry, and Math
            double physics = results[i][0] - results[i][1] - results[i][2];
            double chemistry = results[i][1];
            double maths = results[i][2];
            
            // Printing out the marks, total, average, and percentage
            System.out.printf("%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\n", physics, chemistry, maths, results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numStudents = sc.nextInt();

        // Generate random marks for the students
        double[][] scores = generateRandomScores(numStudents);

        // Calculate the total, average, and percentage
        double[][] results = calculateResults(scores);

        // Display the scorecard
        displayScorecard(results);

        sc.close();
    }
}