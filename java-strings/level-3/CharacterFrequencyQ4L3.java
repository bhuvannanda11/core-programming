import java.util.*;

public class CharacterFrequencyQ4L3 {

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; // Array to store the frequency of characters (ASCII size)

        // Loop through the string to count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++; // Increment the frequency of the character
        }

        // Create a 2D array to store the characters and their frequencies
        int uniqueCharCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCharCount++; // Count unique characters
            }
        }

        String[][] result = new String[uniqueCharCount][2];
        int index = 0;

        // Populate the result array with characters and their frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i); // Store character
                result[index][1] = String.valueOf(frequency[i]); // Store frequency
                index++;
            }
        }

        return result;
    }

    // Method to display the characters and their frequencies
    public static void displayCharacterFrequency(String[][] data) {
        System.out.println("Character Frequencies:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Character: " + data[i][0] + " Frequency: " + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Find the character frequencies
        String[][] result = findCharacterFrequency(str);

        displayCharacterFrequency(result);

        sc.close();
    }
}
