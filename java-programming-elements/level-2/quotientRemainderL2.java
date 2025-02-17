import java.util.*;
public class QuotientRemainderL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int Quotient = num1/num2;
        int remainder = num1 % num2;
        System.out.println("The Quotient is "+Quotient+" and Reminder is "+remainder+" of two numbers "+num1+" and "+num2);


        sc.close();
    }
}
