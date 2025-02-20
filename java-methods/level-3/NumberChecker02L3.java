import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker02L3 {

    // Method to count the digits in the number
    public static int countDigits(int number) {
        return Integer.toString(number).length();
    }

    // Method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of digits
    public static int sumOfDigits(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits
    public static double sumOfSquaresOfDigits(int number) {
        int[] digits = storeDigits(number);
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        int sum = sumOfDigits(number);
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] findDigitFrequency(int number) {
        int[] digits = storeDigits(number);
        int[][] frequency = new int[10][2]; // 10 digits (0-9)
        
        // Initialize the frequency array
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // First column stores the digit
            frequency[i][1] = 0; // Second column stores the frequency
        }
        
        // Count the frequency of each digit
        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }

    // Main method to test the utility class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        // Count of digits
        System.out.println("Count of digits: " + countDigits(number));
        
        // Storing the digits in an array
        int[] digits = storeDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));
        
        // Sum of digits
        System.out.println("Sum of digits: " + sumOfDigits(number));
        
        // Sum of squares of digits
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(number));
        
        // Checking if the number is a Harshad number
        System.out.println("Is Harshad number? " + isHarshadNumber(number));
        
        // Finding the frequency of digits
        int[][] frequency = findDigitFrequency(number);
        System.out.println("Digit frequencies: ");
        for (int[] entry : frequency) {
            if (entry[1] > 0) { // Only print non-zero frequencies
                System.out.println("Digit " + entry[0] + ": " + entry[1]);
            }
        }

        sc.close();
    }
}
