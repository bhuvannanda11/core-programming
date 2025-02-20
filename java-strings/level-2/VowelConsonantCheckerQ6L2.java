import java.util.*;

public class VowelConsonantCheckerQ6L2 {

    // Method to check if the character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        // Convert character to lowercase to handle both upper and lowercase
        ch = Character.toLowerCase(ch);

        // Check if the character is a letter
        if (ch >= 'a' && ch <= 'z') {
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } 
            else {
                return "Consonant";
            }
        } 
        else {
            return "Not a Letter";
        }
    }

    // Method to find vowels and consonants in a string and return the result in a 2D array
    public static String[][] findCharacterTypes(String str) {
        // Initialize a 2D array to store characters and their types (Vowel/Consonant/Not a Letter)
        String[][] result = new String[str.length()][2];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String type = checkCharacterType(ch);
            result[i][0] = String.valueOf(ch);  // Store the character
            result[i][1] = type;               // Store the type (Vowel/Consonant/Not a Letter)
        }

        return result;
    }

    // Method to display the result in tabular format
    public static void displayResult(String[][] data) {
        System.out.printf("%-15s %-15s%n", "Character", "Type");
        System.out.println("------------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-15s %-15s%n", data[i][0], data[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Find vowels and consonants and their types
        String result[][] = findCharacterTypes(str);

        // Display the result in tabular format
        displayResult(result);


        sc.close();
    }
}
