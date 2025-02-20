import java.util.*;

public class FirstNonRepeatCharQ3L3{

    // Method to find the first non-repeating character
    public static char findFirstNonRepeatingCharacter(String text) {
        int[] frequency = new int[256]; // Array to store the frequency of characters (ASCII size)

        // Loop through the string to count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++; // Increment the frequency of the character
        }

        // Loop through the string again to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar; // Return the first non-repeating character
            }
        }

        return '\0'; // Return null character if no non-repeating character is found
    }

    // Main function to take input and display the result
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(str);

        // Display the result
        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } 
        else {
            System.out.println("The first non-repeating character is: " + result);
        }

        sc.close();
    }
}
