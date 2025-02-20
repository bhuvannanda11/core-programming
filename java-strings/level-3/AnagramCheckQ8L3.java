import java.util.*;

public class AnagramCheckQ8L3 {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if lengths are different, if so they can't be anagrams
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create arrays to store the frequency of characters for both strings
        int[] frequency1 = new int[256]; // Array for text1
        int[] frequency2 = new int[256]; // Array for text2

        // Loop through both strings to calculate the frequency of characters
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++; // Increase frequency for text1
            frequency2[text2.charAt(i)]++; // Increase frequency for text2
        }

        // Compare the frequency arrays for both strings
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false; // If frequencies don't match, return false
            }
        }

        return true; // If all frequencies match, return true (anagrams)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user inputs for the two strings
        System.out.print("Enter the first text: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second text: ");
        String str2 = sc.nextLine();

        // Check if the texts are anagrams
        boolean result = areAnagrams(str1, str2);

        // Display the result
        if (result) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }

        sc.close();
    }
}
