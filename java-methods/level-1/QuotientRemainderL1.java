import java.util.*;
public class QuotientRemainderL1 {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int result[] = new int[2];  
        result[0] = number / divisor; 
        result[1] = number % divisor; 
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int divisor = sc.nextInt();


        int result[] = findRemainderAndQuotient(num, divisor);

        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);

        sc.close();
    }
}
