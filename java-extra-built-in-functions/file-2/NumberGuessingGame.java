import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Message for the user
        System.out.println("Think of a number between 1 and 100, and I will try to guess it.");
        
        int low = 1;
        int high = 100;
        int guess = 0;
        String feedback = "";
        
        // Start the guessing loop
        while (!feedback.equals("correct")) {
            // Generate a random guess
            guess = (low + high) / 2;
            System.out.println("My guess is: " + guess);
            
            // Get feedback from the user
            System.out.print("Is my guess high, low, or correct? ");
            feedback = sc.nextLine().toLowerCase();
            
            // Adjust the range based on the user's feedback
            if (feedback.equals("high")) {
                high = guess - 1;
            } 
            else if (feedback.equals("low")) {
                low = guess + 1;
            } 
            else if (!feedback.equals("correct")) {
                System.out.println("Please respond with 'high', 'low', or 'correct'.");
            }
        }
        
        // When the guess is correct
        System.out.println("Yay! I guessed your number: " + guess);
        

        sc.close();
    }
}
