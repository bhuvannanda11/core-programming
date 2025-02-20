import java.util.*;
public class NumberChecker05L5 {

    // Method to find factors of a number
    public static int[] findFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        
        // Loop to find factors
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                factors.add(i); // If i is a factor of number, add it to the list
            }
        }
        
        // Convert list to array and return
        return factors.stream().mapToInt(i -> i).toArray();
    }

    // Method to find the greatest factor of a number
    public static int greatestFactor(int number) {
        int[] factors = findFactors(number);
        int greatest = 0;
        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }
        return greatest;
    }

    // Method to find the sum of factors
    public static int sumOfFactors(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of factors
    public static int productOfFactors(int number) {
        int[] factors = findFactors(number);
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors
    public static double productOfCubesOfFactors(int number) {
        int[] factors = findFactors(number);
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3); // Cube each factor and multiply
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        return sumOfFactors(number) == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        return sumOfFactors(number) > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        return sumOfFactors(number) < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;

        // Sum of the factorial of digits
        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == number; // Check if the sum of factorials equals the number
    }

    // Helper method to calculate factorial of a number
    public static int factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    // Main method to test the utility class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Find factors of the number
        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ":");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Find the greatest factor
        System.out.println("Greatest factor of " + number + ": " + greatestFactor(number));

        // Find the sum of factors
        System.out.println("Sum of factors of " + number + ": " + sumOfFactors(number));

        // Find the product of factors
        System.out.println("Product of factors of " + number + ": " + productOfFactors(number));

        // Find the product of cubes of factors
        System.out.println("Product of cubes of factors of " + number + ": " + productOfCubesOfFactors(number));

        // Check if the number is perfect
        System.out.println("Is " + number + " a perfect number? " + isPerfectNumber(number));

        // Check if the number is abundant
        System.out.println("Is " + number + " an abundant number? " + isAbundantNumber(number));

        // Check if the number is deficient
        System.out.println("Is " + number + " a deficient number? " + isDeficientNumber(number));

        // Check if the number is a strong number
        System.out.println("Is " + number + " a strong number? " + isStrongNumber(number));


        sc.close();
    }
}
