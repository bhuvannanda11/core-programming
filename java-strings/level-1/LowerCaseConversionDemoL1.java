import java.util.Scanner;

public class LowerCaseConversionDemoL1 {

    // Method to convert a string to lowercase using charAt() method
    public static String convertToLowerCaseUsingCharAt(String s) {
        StringBuilder lowerCaseText = new StringBuilder();

        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // If the character is an uppercase letter, convert it to lowercase
            if (currentChar >= 'A' && currentChar <= 'Z') {
                // ASCII difference between uppercase and lowercase is 32
                currentChar = (char) (currentChar + 32);
            }

            // Append the character to the result string
            lowerCaseText.append(currentChar);
        }

        return lowerCaseText.toString();
    }

    // Method to compare two strings and return a boolean result
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some text: ");
        String str = sc.nextLine();

        // Convert the text to lowercase using the user-defined method
        String lowerCaseUsingCharAt = convertToLowerCaseUsingCharAt(str);

        // Convert the text to lowercase using the built-in method
        String lowerCaseUsingBuiltIn = str.toLowerCase();

        boolean areEqual = compareStrings(lowerCaseUsingCharAt, lowerCaseUsingBuiltIn);

        System.out.println("Converted text using charAt() method: " + lowerCaseUsingCharAt);
        System.out.println("Converted text using built-in toLowerCase() method: " + lowerCaseUsingBuiltIn);
        System.out.println("Are both methods' results the same? " + areEqual);

        sc.close();
    }
}
