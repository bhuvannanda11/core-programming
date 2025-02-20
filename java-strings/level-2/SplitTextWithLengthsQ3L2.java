import java.util.Scanner;
import java.util.Arrays;

public class SplitTextWithLengthsQ3L2 {

    // Method to find the length of a string without using length() method
    public static int findStringLengthWithoutLengthMethod(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } 
        catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split text into words using charAt() without using split()
    public static String[] customSplit(String s) {
        // Count the number of words
        int wordCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || (s.charAt(i - 1) == ' ' && s.charAt(i) != ' ')) {
                wordCount++;
            }
        }

        // Create an array to store the indexes of spaces
        int[] spaceIndexes = new int[wordCount];
        int wordIndex = 0;
        int wordStartIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || (s.charAt(i - 1) == ' ' && s.charAt(i) != ' ')) {
                spaceIndexes[wordIndex++] = i;
            }
        }

        // Create an array to store the words
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            int start = spaceIndexes[i];
            int end = (i + 1 < wordCount) ? spaceIndexes[i + 1] - 1 : s.length();
            words[i] = s.substring(start, end);
        }

        return words;
    }

    // Method to create a 2D array with words and their lengths
    public static String[][] getWordsAndLengths(String[] words) {
        String result[][] = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];  // Word
            result[i][1] = String.valueOf(findStringLengthWithoutLengthMethod(words[i])); // Length
        }
        return result;
    }

    // Method to display the result in tabular format
    public static void displayResult(String[][] data) {
        System.out.printf("%-15s %-10s%n", "Word", "Length");
        System.out.println("------------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-15s %-10d%n", data[i][0], Integer.parseInt(data[i][1]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a text: ");
        String str = sc.nextLine();


        String[] words = customSplit(str);
        String[][] wordsAndLengths = getWordsAndLengths(words);

        displayResult(wordsAndLengths);


        sc.close();
    }
}
