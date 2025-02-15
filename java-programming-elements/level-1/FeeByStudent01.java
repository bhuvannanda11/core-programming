import java.util.*;
public class FeeByStudent01 {
    public static void main(String[] args) {
        float fee = 125000;

        float discountPercentage = 10;

        float discount = fee / discountPercentage;

        float feesPaid = fee - discount;
        
        System.out.println("The discount amount is INR "+discount +" and final discounted fee is INR "+feesPaid);
    }
}
