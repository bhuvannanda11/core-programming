import java.util.*;

public class CharacterArrayComparisonL1 {

    // Method to return the characters in a string (without using toCharArray())
    public static char[] getCharactersFromString(String str) {
        // Create a character array with the same length as the string
        char chars[] = new char[str.length()];

        // Loop through the string and store each character in the array
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }

        return chars;
    }

    // Method to compare two character arrays and return a boolean result
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        // Compare each character in both arrays
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.next();

        // Get characters from the string using the user-defined method
        char userDefinedArray[] = getCharactersFromString(str);

        // Get characters from the string using the built-in toCharArray() method
        char builtInArray[] = str.toCharArray();

        // Compare the two arrays using the compareCharArrays method
        boolean comparisonResult = compareCharArrays(userDefinedArray, builtInArray);

        // Display the results
        System.out.println("Characters using user-defined method: ");
        for (char c : userDefinedArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Characters using toCharArray() method: ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Check two arrays are the same or not and print them
        if (comparisonResult) {
            System.out.println("Both methods returned the same character arrays.");
        } else {
            System.out.println("The character arrays from both methods are different.");
        }

        sc.close();
    }
}
