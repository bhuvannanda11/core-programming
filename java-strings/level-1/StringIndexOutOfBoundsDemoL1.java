import java.util.Scanner;

public class StringIndexOutOfBoundsDemoL1 {

    public static void generateStringIndexOutOfBoundsException(String str) {
        // Attempt to access an index beyond the length of the string
        System.out.println(str.charAt(str.length())); 
        // This will throw StringIndexOutOfBoundsException
    }

    public static void handleStringIndexOutOfBoundsException(String str) {
        try {
            // Attempt to access an index beyond the length of the string
            System.out.println(str.charAt(str.length()));
            // This will throw StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            // Catch the exception and handle it
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();


        System.out.println("\nGenerating StringIndexOutOfBoundsException ");
        generateStringIndexOutOfBoundsException(str);


        System.out.println("\nHandling StringIndexOutOfBoundsException ");
        handleStringIndexOutOfBoundsException(str);

        sc.close();
    }
}
