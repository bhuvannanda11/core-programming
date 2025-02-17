import java.util.*;
public class StudentGradeCalculatorL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        
        int physics[] = new int[n];
        int chemistry[] = new int[n];
        int maths[] = new int[n];
        double percentage[] = new double[n];
        String grade[] = new String[n];

        for (int i = 0; i < n; i++) {
            int phy, chem, math;

            // Input for Physics
            do {
                System.out.print("Enter Physics marks for Student " + (i + 1) + ": ");
                phy = sc.nextInt();
            } while (phy < 0);

            // Input for Chemistry
            do {
                System.out.print("Enter Chemistry marks for Student " + (i + 1) + ": ");
                chem = sc.nextInt();
            } while (chem < 0);

            // Input for Maths
            do {
                System.out.print("Enter Maths marks for Student " + (i + 1) + ": ");
                math = sc.nextInt();
            } while (math < 0);

            physics[i] = phy;
            chemistry[i] = chem;
            maths[i] = math;

            percentage[i] = (phy + chem + math) / 3.0;

            if (percentage[i] >= 90) {
                grade[i] = "A";
            } 
            else if (percentage[i] >= 80) {
                grade[i] = "B";
            } 
            else if (percentage[i] >= 70) {
                grade[i] = "C";
            } 
            else if (percentage[i] >= 60) {
                grade[i] = "D";
            } 
            else {
                grade[i] = "F";
            }
        }

        System.out.println("\nStudent Report:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("  Physics = " + physics[i]);
            System.out.println("  Chemistry = " + chemistry[i]);
            System.out.println("  Maths = " + maths[i]);
            System.out.println("  Percentage = " + String.format("%.2f", percentage[i]) + "%");
            System.out.println("  Grade = " + grade[i]);
            System.out.println(); // Adding a blank line for separation
        }

        sc.close();
    }
}
