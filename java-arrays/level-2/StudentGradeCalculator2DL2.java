import java.util.*;
public class StudentGradeCalculator2DL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int marks[][] = new int[n][3]; 
        // [Physics, Chemistry, Maths]
        double percentage1[] = new double[n];
        String grade1[] = new String[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                String subject;
                if (j == 0) {
                    subject = "Physics";
                } 
                else if (j == 1) {
                    subject = "Chemistry";
                } 
                else {
                    subject = "Maths";
                }
                
                do {
                    System.out.print("Enter " + subject + " marks for Student " + (i + 1) + ": ");
                    marks[i][j] = sc.nextInt();
                } while (marks[i][j] < 0);
            }

            percentage1[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentage1[i] >= 90) {
                grade1[i] = "A";
            } else if (percentage1[i] >= 80) {
                grade1[i] = "B";
            } else if (percentage1[i] >= 70) {
                grade1[i] = "C";
            } else if (percentage1[i] >= 60) {
                grade1[i] = "D";
            } else {
                grade1[i] = "F";
            }
        }


        System.out.println("Student Report: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("  Physics = " + marks[i][0]);
            System.out.println("  Chemistry = " + marks[i][1]);
            System.out.println("  Maths = " + marks[i][2]);
            System.out.println("  Percentage = " + String.format("%.2f", percentage1[i]) + "%");
            System.out.println("  Grade = " + grade1[i]);
            System.out.println(); // Blank line for separation between students
        }


        sc.close();
    }
}
