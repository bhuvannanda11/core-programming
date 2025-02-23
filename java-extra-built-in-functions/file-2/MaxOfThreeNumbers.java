import java.util.Scanner;

public class MaxOfThreeNumbers {
    
    // Function to take integer input from the user
    public static int getInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }
    
    // Function to find the maximum of three numbers
    public static int findMax(int num1, int num2, int num3) {
        int max = num1;
        
        // Compare num1 with num2
        if (num2 > max) {
            max = num2;
        }
        
        // Compare the current max with num3
        if (num3 > max) {
            max = num3;
        }
        
        return max;
    }

    public static void main(String[] args) {
        // Take input from the user
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");
        int num3 = getInput("Enter the third number: ");
        
        // Find the maximum of the three numbers
        int max = findMax(num1, num2, num3);
        
        // Display the maximum number
        System.out.println("The maximum of the three numbers is: " + max);
    }
}
