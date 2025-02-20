import java.util.*;

public class UniqueCharactersQ2L3 {

    // Method to find the length of the string without using String's length() method
    public static int findLength(String text) {
        int length = 0;
        while (true) {
            try {
                text.charAt(length);
                length++;
            } 
            catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return length;
    }

    // Method to find unique characters in the string using charAt() method
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] result = new char[length];  // Array to store the unique characters
        int resultIndex = 0;

        // Outer loop to go through each character in the text
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Inner loop to check if the character is already found
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, add it to the result array
            if (isUnique) {
                result[resultIndex] = currentChar;
                resultIndex++;
            }
        }

        // Create a new array with the exact size of the result (unique characters)
        char[] uniqueChars = new char[resultIndex];
        System.arraycopy(result, 0, uniqueChars, 0, resultIndex);
        return uniqueChars;
    }

    // Method to display the unique characters
    public static void displayUniqueCharacters(char[] uniqueChars) {
        System.out.println("Unique characters in the string are:");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Finding unique characters
        char[] uniqueChars = findUniqueCharacters(str);

        // Display the result
        displayUniqueCharacters(uniqueChars);

        sc.close();
    }
}
