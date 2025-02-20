import java.util.*;
public class NumberChecker04L4 {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Found a divisor other than 1 and the number itself
            }
        }
        return true; // No divisors found, it's a prime number
    }

    // Method to check if a number is neon
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        
        // Sum the digits of the square of the number
        while (square != 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        
        return sumOfDigits == number; // Check if the sum of digits is equal to the number
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        
        // Calculate the sum and product of digits
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        
        return sum == product; // Check if sum and product are equal
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        
        // Check if the square ends with the number itself
        return Integer.toString(square).endsWith(Integer.toString(number));
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || Integer.toString(number).endsWith("7");
    }

    // Main method to test the utility class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Check if the number is prime
        System.out.println("Is prime? " + isPrime(number));

        // Check if the number is neon
        System.out.println("Is neon? " + isNeon(number));

        // Check if the number is a spy number
        System.out.println("Is spy? " + isSpy(number));

        // Check if the number is automorphic
        System.out.println("Is automorphic? " + isAutomorphic(number));

        // Check if the number is buzz
        System.out.println("Is buzz? " + isBuzz(number));

        sc.close();
    }
}
