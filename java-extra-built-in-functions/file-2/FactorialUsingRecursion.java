import java.util.Scanner;

public class FactorialUsingRecursion {

    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        return sc.nextInt();
    }

    // Recursive function to calculate the factorial of a number
    public static long calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return num * calculateFactorial(num - 1); // Recursive case
    }

    // Function to display the result
    public static void displayResult(int num, long factorial) {
        System.out.println("The factorial of " + num + " is: " + factorial);
    }

    public static void main(String[] args) {

        int n = getInput();

        // Calculate the factorial using recursion
        long fact = calculateFactorial(n);

        // Display the result
        displayResult(n, fact);
    }
}
