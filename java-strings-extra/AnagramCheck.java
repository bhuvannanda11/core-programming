import java.util.Scanner;

public class AnagramCheck {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        for (int i = 0; i < str1.length(); i++) {
            char char1 = str1.charAt(i);
            boolean found = false;

            for (int j = 0; j < str2.length(); j++) {
                if (char1 == str2.charAt(j)) {
                    // Remove the character from second string by replacing it with a placeholder
                    str2 = str2.substring(0, j) + str2.substring(j + 1);
                    found = true;
                    break;
                }
            }

            // If character is not found in the second string, they are not anagrams
            if (!found) {
                return false;
            }
        }

        // If all characters match, the strings are anagrams
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        
        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } 
        else {
            System.out.println("The strings are NOT anagrams.");
        }
        

        sc.close();
    }
}
