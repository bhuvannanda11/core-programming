import java.util.*;
public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float costPrice = 129;
        float sellingPrice = 191;

        float profit = sellingPrice - costPrice;
        float profitPercentage = (profit/costPrice) *100;

        System.out.println("The Cost Price is INR "+costPrice +" and Selling Price is INR "+sellingPrice);
        System.out.println("The Profit is INR"+profit+" and the Profit Percentage is "+profitPercentage);

        sc.close();
    }
}
