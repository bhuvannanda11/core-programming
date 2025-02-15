import java.util.*;
public class DivisibilityL1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int num = sc.nextInt();

        System.out.println("Is the number "+num+" divisible by 5? "+(num%5 == 0));

        sc.close();
    }
}