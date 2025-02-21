import java.util.*;

public class StringsCompareLexicographically {

    public static int compareStrings(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        
        // Loop through each character of both strings
        for (int i = 0; i < minLength; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            
            // Compare characters at the same position
            if (ch1 < ch2) {
                return -1; // str1 comes before str2
            } 
            else if (ch1 > ch2) {
                return 1;  // str1 comes after str2
            }
        }
        
        // If all characters are the same up to the minLength, compare lengths
        if (str1.length() < str2.length()) {
            return -1; // str1 comes before str2
        } 
        else if (str1.length() > str2.length()) {
            return 1;  // str1 comes after str2
        }
        
        return 0; // The strings are equal
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        

        int result = compareStrings(str1, str2);
    

        if (result == -1) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.");
        } 
        else if (result == 1) {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order.");
        } 
        else {
            System.out.println("The strings \"" + str1 + "\" and \"" + str2 + "\" are equal.");
        }
        
        sc.close();
    }
}
