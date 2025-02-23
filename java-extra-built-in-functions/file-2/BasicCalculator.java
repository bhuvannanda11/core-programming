import java.util.*;

public class BasicCalculator {

    // Function for addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Function for subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Function for multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Function for division
    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Show the available operations to the user
        System.out.println("Basic Calculator");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Choose an operation (1/2/3/4): ");
        
        int choice = sc.nextInt(); // User's choice

        // Ask the user for the two numbers
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        double result = 0;

        // Perform the chosen operation
        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 4:
                result = divide(num1, num2);
                if (!Double.isNaN(result)) {
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid choice! Please select a valid operation.");
        }


        sc.close();
    }
}
