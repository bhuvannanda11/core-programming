import java.util.Scanner;
import java.util.Arrays;

public class SplitTextQ2L2 {

    // Method to find the length of the string without using length() method
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
        int spaceIndexes[] = new int[wordCount];
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

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String str = sc.nextLine();

        // Use the custom split method
        String[] customSplitWords = customSplit(str);

        // Use the built-in split() method
        String[] splitWords = str.split("\\s+");

        // Compare the two arrays
        boolean areArraysEqual = compareStringArrays(customSplitWords, splitWords);

        // Display the results
        System.out.println("Words split using custom method: " + Arrays.toString(customSplitWords));
        System.out.println("Words split using built-in split() method: " + Arrays.toString(splitWords));
        System.out.println("Are both methods giving the same result? " + areArraysEqual);


        sc.close();
    }
}
