import java.util.*;
public class FactorOfNumL2 {
    public static int[] findFactors(int number) {
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int factors[] = new int[count];
        int idx = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[idx] = i;
                idx++;
            }
        }
        return factors;
    }


    public static int findSumFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int findProductFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }


    public static double findSumOfSquareFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();

        int factors[] = findFactors(n);
        System.out.print("Factors of "+n+" are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        int sumOfFactors = findSumFactors(factors);
        System.out.println("Sum of factors: " + sumOfFactors);

        int productOfFactors = findProductFactors(factors);
        System.out.println("Product of factors: " + productOfFactors);

        double sumOfSquares = findSumOfSquareFactors(factors);
        System.out.println("Sum of squares of factors: " + sumOfSquares);


        sc.close();
    }
}
