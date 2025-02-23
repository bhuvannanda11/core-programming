import java.util.*;

public class PrimeNumberChecker {
    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        // Handle edge cases for numbers less than 2
        if (n <= 1) {
            return false;
        }
        
        // Check divisibility from 2 to the square root of num
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        // Check if the number is prime
        boolean isPrime = isPrime(n);
        
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        }
        else {
            System.out.println(n + " is not a prime number.");
        }
        
        sc.close();
    }
}
