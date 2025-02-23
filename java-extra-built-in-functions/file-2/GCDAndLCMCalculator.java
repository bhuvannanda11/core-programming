import java.util.Scanner;

public class GCDAndLCMCalculator {

    // Function to calculate GCD (Greatest Common Divisor)
    public static int gcd(int a, int b) {
        // Use Euclidean algorithm to find GCD
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM (Least Common Multiple)
    public static int lcm(int a, int b) {
        // Formula: LCM = (a * b) / GCD(a, b)
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask the user for two numbers
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Calculate and display the GCD
        int gcdResult = gcd(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcdResult);

        // Calculate and display the LCM
        int lcmResult = lcm(num1, num2);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcmResult);

        // Close the scanner
        sc.close();
    }
}
