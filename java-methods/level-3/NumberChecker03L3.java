import java.util.*;

public class NumberChecker03L3 {

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

    // Method to reverse the digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        int index = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            reversed[index++] = digits[i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean compareArrays(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseArray(digits);
        return compareArrays(digits, reversedDigits);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            if (digit != 0) {
                return true;  // Duck number has a non-zero digit
            }
        }
        return false;
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
        
        // Reversing the digits
        int[] reversedDigits = reverseArray(digits);
        System.out.println("Reversed digits: " + Arrays.toString(reversedDigits));
        
        // Checking if the number is a palindrome
        System.out.println("Is palindrome? " + isPalindrome(number));
        
        // Checking if the number is a duck number
        System.out.println("Is duck number? " + isDuckNumber(number));

        sc.close();
    }
}
