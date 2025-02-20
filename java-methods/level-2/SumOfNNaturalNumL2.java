import java.util.*;
public class SumOfNNaturalNumL2 {
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }

    public static int sumUsingFormula(int n) {
        return (n * (n + 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");        
        int n = sc.nextInt();

        int sumRecursion = sumUsingRecursion(n);
        int sumFormula = sumUsingFormula(n);

        System.out.println("Sum of first "+n+" natural numbers using recursion: "+sumRecursion);
        System.out.println("Sum of first "+n+" natural numbers using the formula: "+sumFormula);

        // Comparing the two results (sumRecursion and sumFormula)
        if (sumRecursion == sumFormula) {
            System.out.println("Both results are equal");
        } else {
            System.out.println("Both results are not equal");
        }

        sc.close();
    }
}
