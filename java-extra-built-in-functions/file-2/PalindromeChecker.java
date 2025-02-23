import java.util.*;

public class PalindromeChecker {
    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        return sc.nextLine();
    }

    // Function to check if the given string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for a case-insensitive check
        str = str.replaceAll("[\\W_]", "").toLowerCase(); // Remove non-alphanumeric characters and make lowercase
        //replaceAll("[\\W_]", "") removes all non-word characters (spaces, commas, exclamation marks, etc.):
        int left = 0;
        int right = str.length() - 1;

        // Check the characters from both ends of the string
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // It is a palindrome
    }


    public static void displayResult(boolean result) {
        if (result) {
            System.out.println("The string is a palindrome.");
        } 
        else {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        String str = getInput();
        boolean result = isPalindrome(str);
        displayResult(result);

    }
}
