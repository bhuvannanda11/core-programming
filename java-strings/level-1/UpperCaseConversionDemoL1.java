import java.util.Scanner;

public class UpperCaseConversionDemoL1 {

    // Method to convert a string to uppercase using charAt() method
    public static String convertToUpperCaseUsingCharAt(String s) {
        StringBuilder upperCaseText = new StringBuilder();

        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            // If the character is a lowercase letter, convert it to uppercase
            if (currentChar >= 'a' && currentChar <= 'z') {
                // ASCII difference between lowercase and uppercase is 32
                currentChar = (char) (currentChar - 32);
            }

            // Append the character to the result string
            upperCaseText.append(currentChar);
        }
        
        return upperCaseText.toString();
    }

    // Method to compare two strings and return a boolean result
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter some text: ");
        String str = sc.nextLine();

        // Convert the text to uppercase using the user-defined method
        String upperCaseUsingCharAt = convertToUpperCaseUsingCharAt(str);
        
        // Convert the text to uppercase using the built-in method
        String upperCaseUsingBuiltIn = str.toUpperCase();

        // Compare the two results
        boolean areEqual = compareStrings(upperCaseUsingCharAt, upperCaseUsingBuiltIn);

        // Display the results
        System.out.println("Converted text using charAt() method: " + upperCaseUsingCharAt);
        System.out.println("Converted text using built-in toUpperCase() method: " + upperCaseUsingBuiltIn);
        System.out.println("Are both methods' results the same? " + areEqual);


        sc.close();
    }
}
