import java.util.*;
public class NullPointerDemoL1 {

    public static void generateNullPointerException() {
        String str = null;
        System.out.println(str.length()); 
        // This will throw NullPointerException
    }

    // Method to handle NullPointerException using try-catch block
    public static void handleNullPointerException() {
        String s = null;

        // Using try-catch block to handle NullPointerException
        try {
            System.out.println(s.length()); 
            // This will throw NullPointerException
        } catch (NullPointerException e) {
            // Catch the exception and handle it
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Generating NullPointerException ");
        generateNullPointerException();

        System.out.println("Handling NullPointerException ");
        handleNullPointerException();
    }
}
