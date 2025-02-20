import java.util.*;
public class NumberFormatExceptionDemoL1 {
    public static void generateNumberFormatException(String s) {
        // Attempt to convert the text to an integer (will throw NumberFormatException if text is not a valid number)
        System.out.println(Integer.parseInt(s));
        // This will throw NumberFormatException if text is not a number
    }

    public static void handleNumberFormatException(String s) {
        try {
            // Attempt to convert the text to an integer
            System.out.println(Integer.parseInt(s));
            // This will throw NumberFormatException if text is not a number
        } catch (NumberFormatException e) {
            // Catch the NumberFormatException and handle it
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Catch any other runtime exceptions
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number as a string: ");
        String str = sc.next();


        System.out.println("\nGenerating NumberFormatException...");
        generateNumberFormatException(str);

        // Now, call the method that handles the exception
        System.out.println("\nHandling NumberFormatException...");
        handleNumberFormatException(str);

        sc.close();
    }
}
