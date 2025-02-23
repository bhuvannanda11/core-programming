import java.util.*;

public class FibonacciSequence {

    public static void generateFibonacciSequence(int n) {
        // First two Fibonacci numbers
        int first = 0;
        int second = 1;

            System.out.print(first + " ");
            System.out.print(second + " ");

        // Generate the rest of the sequence
        for (int i = 2; i < n; i++) {
            int nextTerm = first + second;
            System.out.print(nextTerm + " ");
            first = second;
            second = nextTerm;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int numTerms = sc.nextInt();

        generateFibonacciSequence(numTerms);
        
        sc.close();
    }
}
