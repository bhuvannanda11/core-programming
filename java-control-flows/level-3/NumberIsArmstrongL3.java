import java.util.*;
public class NumberIsArmstrongL3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int n = num;
        int sum = 0;

        while(n != 0) {
            int digit = n % 10;
            sum = sum + (digit * digit * digit);
            n = n / 10;
        }

        if (sum == num) {
            System.out.println(num+" is an Armstrong number.");
        } else {
            System.out.println(num+" is NOT an Armstrong number.");
        }


        sc.close();
    }
}
