import java.util.*;

public class CharFreqUniqueQ5L3 {

    // Method to find unique characters in a string using the charAt() method
    public static char[] uniqueCharacters(String text) {
        // Array to store unique characters
        char[] temp = new char[text.length()];
        int index = 0;

        // Loop through the string to find unique characters
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the character is already in the temp array
            for (int j = 0; j < index; j++) {
                if (temp[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If it's a unique character, add it to the temp array
            if (isUnique) {
                temp[index++] = currentChar;
            }
        }

        // Create a new array of exact size for unique characters
        char[] uniqueChars = new char[index];
        System.arraycopy(temp, 0, uniqueChars, 0, index);
        return uniqueChars;
    }

    // Method to find the frequency of characters in a string and return the result as a 2D array
    public static String[][] findCharacterFrequency(String text) {
        // Find unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Create a 2D array to store characters and their frequencies
        String[][] frequencyArray = new String[uniqueChars.length][2];

        // Loop through the unique characters and calculate their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            char currentChar = uniqueChars[i];
            int frequency = 0;

            // Loop through the text to count the frequency of the current character
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == currentChar) {
                    frequency++;
                }
            }

            // Store the character and its frequency in the 2D array
            frequencyArray[i][0] = String.valueOf(currentChar);
            frequencyArray[i][1] = String.valueOf(frequency);
        }

        return frequencyArray;
    }

    // Method to display the frequency of characters
    public static void displayCharacterFrequency(String[][] data) {
        System.out.println("Character Frequencies:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Character: " + data[i][0] + " Frequency: " + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Find the character frequencies using the unique characters
        String result[][] = findCharacterFrequency(str);

        // Display the result
        displayCharacterFrequency(result);

        sc.close();
    }
}
