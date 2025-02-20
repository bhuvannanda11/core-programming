import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemoL1 {

    public static void generateArrayIndexOutOfBoundsException(String[] names) {
        // Attempt to access an index that is out of bounds
        System.out.println(names[5]);  
        // This will throw ArrayIndexOutOfBoundsException if the array length is less than or equal to 5
    }

    // Method to demonstrate ArrayIndexOutOfBoundsException using try-catch block
    public static void handleArrayIndexOutOfBoundsException(String[] names) {
        try {
            // Attempt to access an index that is out of bounds
            System.out.println(names[5]);  
            // This will throw ArrayIndexOutOfBoundsException if the array length is less than or equal to 5
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch the ArrayIndexOutOfBoundsException and handle it
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Catch any other runtime exceptions
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of names you want to input: ");
        int n = sc.nextInt();
        sc.nextLine();

        String str[] = new String[n];

        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }

        // First, call the method that generates the exception
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException ");
        generateArrayIndexOutOfBoundsException(str);

        // Now, call the method that handles the exception
        System.out.println("\nHandling ArrayIndexOutOfBoundsException ");
        handleArrayIndexOutOfBoundsException(str);

        sc.close();
    }
}
