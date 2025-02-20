import java.util.*;

public class CharFreqNestedLoopsQ6L3 {

    // Method to find the frequency of characters using nested loops
    public static String[] findCharacterFrequency(String text) {
        // Convert the string into a character array
        char[] chars = text.toCharArray();
        int[] frequency = new int[chars.length]; // Array to store frequency of each character
        String[] result = new String[chars.length]; // Array to store the characters and their frequencies

        // Outer loop to iterate through each character
        for (int i = 0; i < chars.length; i++) {
            // Skip already counted characters
            if (chars[i] == '0') {
                continue;
            }

            // Initialize the frequency of the current character to 1
            frequency[i] = 1;

            // Inner loop to find duplicate characters
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    // If duplicate found, increment the frequency and mark the character as counted
                    frequency[i]++;
                    chars[j] = '0'; // Mark this character as counted by setting it to '0'
                }
            }

            // Store the character and its frequency in the result array
            result[i] = chars[i] + ": " + frequency[i];
        }

        return result;
    }

    // Method to display the frequency of characters
    public static void displayCharacterFrequency(String[] data) {
        System.out.println("Character Frequencies:");
        for (String str : data) {
            if (str != null) { // Only print non-null entries
                System.out.println(str);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Find the character frequencies using nested loops
        String result[] = findCharacterFrequency(str);

        // Display the result
        displayCharacterFrequency(result);

        sc.close();
    }
}
