import java.util.Scanner;

public class TrimStringCharAtQ7L2 {

    // Method to trim leading and trailing spaces from a string using charAt()
    public static int[] trimSpacesUsingCharAt(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Trim leading spaces
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring from a string using charAt() method
    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt() method and return a boolean result
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with leading and trailing spaces: ");
        String userInput = sc.nextLine();

        // Trim the spaces using charAt() method
        int[] trimmedIndexes = trimSpacesUsingCharAt(userInput);
        String trimmedWithCharAt = createSubstringUsingCharAt(userInput, trimmedIndexes[0], trimmedIndexes[1]);

        // Trim the spaces using the built-in trim() method
        String trimmedWithBuiltIn = userInput.trim();

        // Compare the results
        boolean areEqual = compareStringsUsingCharAt(trimmedWithCharAt, trimmedWithBuiltIn);

        // Display the results
        System.out.println("\nTrimmed string using charAt(): \"" + trimmedWithCharAt + "\"");
        System.out.println("Trimmed string using built-in trim(): \"" + trimmedWithBuiltIn + "\"");

        if (areEqual) {
            System.out.println("Both methods produced the same result.");
        } 
        else {
            System.out.println("The methods produced different results.");
        }


        sc.close();
    }
}
