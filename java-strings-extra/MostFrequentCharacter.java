import java.util.*;

public class MostFrequentCharacter {

    public static char findMostFrequentCharacter(String str) {
        int[] freq = new int[256]; // Array to store frequency of characters (ASCII size)
        
        // Loop through the string and count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;  // Increase the frequency of the character
        }
        
        // Find the character with the highest frequency
        int maxFreq = -1;  // Store the maximum frequency
        char mostFrequentChar = ' '; // To store the most frequent character

        for (int i = 0; i < 256; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i]; // Update max frequency
                mostFrequentChar = (char) i; // Update the most frequent character
            }
        }

        return mostFrequentChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        
        char result = findMostFrequentCharacter(str);
        System.out.println("Most Frequent Character: '" + result + "'");
        
        sc.close();
    }
}
