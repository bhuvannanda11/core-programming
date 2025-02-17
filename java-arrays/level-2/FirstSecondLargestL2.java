import java.util.*;
public class FirstSecondLargestL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int digits[] = new int[10];
        int idx = 0;

        while(n != 0 && idx < 10){
            digits[idx++] = n % 10;
            n = n / 10;
        }

        if(idx == 0){
            System.out.println("No digits entered.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<idx;i++){
            if(digits[i] > largest){
                secondLargest = largest;
                largest = digits[i];
            }
            else if(digits[i] > secondLargest && digits[i] != largest){
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest Number is :"+largest);
        System.out.println("Second Largest Number is :"+secondLargest);


        sc.close();
    }
}
