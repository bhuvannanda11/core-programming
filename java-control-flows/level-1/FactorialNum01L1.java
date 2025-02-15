import java.util.*;
public class FactorialNum01L1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // Factorial of a number using while loop
        int fact = 1,i = 1;
            while (i <= num) {
                fact *= i;
                i++;
            }
        System.out.println("Factorial of " + num + " is " + fact);

        sc.close();
    }
}
