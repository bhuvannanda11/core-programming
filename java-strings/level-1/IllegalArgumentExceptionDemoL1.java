import java.util.Scanner;

public class IllegalArgumentExceptionDemoL1 {

    public static void generateIllegalArgumentException(String str) {
        // Attempt to call substring with start index greater than the end index
        System.out.println(str.substring(5, 3));  
        // This will throw IllegalArgumentException
    }

    public static void handleIllegalArgumentException(String str) {
        try {
            // Attempt to call substring with start index greater than the end index
            System.out.println(str.substring(5, 3));  
            // This will throw IllegalArgumentException
        } catch (IllegalArgumentException e) {
            // Catch and handle IllegalArgumentException
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Catch other runtime exceptions
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String str = sc.next();

        System.out.println("\nGenerating IllegalArgumentException...");
        generateIllegalArgumentException(str);

        System.out.println("\nHandling IllegalArgumentException...");
        handleIllegalArgumentException(str);

        sc.close();
    }
}
