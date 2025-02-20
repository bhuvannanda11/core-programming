import java.util.*;

public class PalindromeCheckQ7L3 {

    // Logic 1: Iterative method to check palindrome
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; // If characters don't match, return false
            }
            start++;
            end--;
        }
        return true; // If loop completes, it's a palindrome
    }

    // Logic 2: Recursive method to check palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true; // Base case: If start index crosses or equals end, it's a palindrome
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false; // If characters don't match, return false
        }

        // Recursively check the next pair of characters
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Character array method to check palindrome
    public static boolean isPalindromeUsingArray(String text) {
        // Convert the string to a character array
        char[] originalArray = text.toCharArray();
        char[] reverseArray = new char[originalArray.length];
        
        // Reverse the array
        for (int i = 0; i < originalArray.length; i++) {
            reverseArray[i] = originalArray[originalArray.length - 1 - i];
        }

        // Compare the original and reversed arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reverseArray[i]) {
                return false; // If characters don't match, return false
            }
        }
        return true; // If all characters match, it's a palindrome
    }

    // Main method to test all three approaches
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Logic 1: Iterative Palindrome check
        boolean resultIterative = isPalindromeIterative(str);
        System.out.println("Using Iterative Method: " + (resultIterative ? "Palindrome" : "Not a palindrome"));

        // Logic 2: Recursive Palindrome check
        boolean resultRecursive = isPalindromeRecursive(str, 0, str.length() - 1);
        System.out.println("Using Recursive Method: " + (resultRecursive ? "Palindrome" : "Not a palindrome"));

        // Logic 3: Character Array Palindrome check
        boolean resultArray = isPalindromeUsingArray(str);
        System.out.println("Using Character Array Method: " + (resultArray ? "Palindrome" : "Not a palindrome"));

        sc.close();
    }
}
