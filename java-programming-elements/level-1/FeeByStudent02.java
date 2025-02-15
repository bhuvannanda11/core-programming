import java.util.*;
public class FeeByStudent02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fees paid by the student :");
        float fee = sc.nextFloat();

        System.out.println("Enter the discount :");
        float discountPercentage = sc.nextFloat();

        float discount = (fee * discountPercentage) /100;

        float feesPaid = fee - discount;
        
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+ feesPaid);


        sc.close();
    }
}