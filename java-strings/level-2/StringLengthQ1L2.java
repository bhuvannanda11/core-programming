import java.util.*;
public class StringLengthQ1L2 {

    // Method to find length without using length() method
    public static int findStringLengthWithoutLengthMethod(String str) {
        int count = 0;
        // Infinite loop to count characters using charAt
        try {
            while (true) {
                str.charAt(count); // Try to access each character
                count++; // Increment count for each valid character
            }
        } 
        catch (StringIndexOutOfBoundsException e) {
            // When the exception occurs, we have counted all characters
            return count; // Return the final count
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        
        // Find and print length using the user-defined method
        int customLength = findStringLengthWithoutLengthMethod(str);
        System.out.println("Length of string (using custom method): " + customLength);
        
        // Find and print length using the built-in length() method
        int builtInLength = str.length();
        System.out.println("Length of string (using built-in length() method): " + builtInLength);
        

        sc.close();
    }
}
