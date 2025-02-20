import java.util.*;

public class StudentVotingQ8L2 {

    // Method to generate a random 2-digit age for 'n' students
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        Scanner scanner = new Scanner(System.in);

        // Taking user input for ages of n students
        for (int i = 0; i < n; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }
        
        return ages;
    }

    // Method to check whether each student can vote based on age
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];  // 2D array to store age and voting status
        
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                result[i][0] = String.valueOf(ages[i]);  // Store age
                result[i][1] = "Invalid Age";  // Invalid age case
            } else {
                result[i][0] = String.valueOf(ages[i]);  // Store age
                // Check if the student can vote (age >= 18)
                if (ages[i] >= 18) {
                    result[i][1] = "Can Vote";
                } else {
                    result[i][1] = "Cannot Vote";
                }
            }
        }
        return result;
    }

    // Method to display the result in tabular format
    public static void displayResult(String[][] result) {
        System.out.printf("%-10s %-15s%n", "Age", "Voting Status");
        System.out.println("----------------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-10s %-15s%n", result[i][0], result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();

        // Get ages of students from the user
        int[] studentAges = generateAges(numberOfStudents);

        // Check voting eligibility for each student
        String[][] votingEligibility = checkVotingEligibility(studentAges);

        // Display the results in a tabular format
        displayResult(votingEligibility);

        sc.close();
    }
}
