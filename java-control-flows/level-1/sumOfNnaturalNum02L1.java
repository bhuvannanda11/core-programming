import java.util.*;
public class sumOfNnaturalNum02L1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n > 0){
            int sum1 = n *(n+1)/2;   // using formula
        
            int sum2 = 0;
            for(int i=n;i>=1;i--){
                sum2 += i;
            }
        System.out.println("Sum using formula is :"+sum1);
        System.out.println("Sum using for loop is :"+sum2);

        System.out.println("Both the sum are :"+(sum1 == sum2));
        }
        else{
            System.out.println("Not a Natural Number");
        }



        sc.close();
    }
}
