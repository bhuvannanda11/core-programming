import java.util.*;

public class RemoveCharacter {

    // Method to remove all occurrences of a specific character
    public static String removeCharacter(String str, char charToRemove) {
        // Create a new string to store the modified string
        StringBuilder result = new StringBuilder();
        
        // Loop through each character in the original string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            
            // If the character is not the one to remove, add it to the result
            if (currentChar != charToRemove) {
                result.append(currentChar);
            }
        }
        
        return result.toString(); // Return the modified string
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        
        System.out.print("Enter the character to remove: ");
        char charToRemove = sc.next().charAt(0);
        
        // Call the method to remove the character
        String ans = removeCharacter(str, charToRemove);
        
        // Display the modified string
        System.out.println("Modified String: " + ans);
        

        sc.close();
    }
}
