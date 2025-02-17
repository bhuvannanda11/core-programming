import java.util.*;
public class FirstSecondLargestTempArrL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();

        int maxDigit = 10;
        int digits[] = new int[10];
        int idx = 0;

        while(n !=0){
            if(idx == maxDigit){
                maxDigit = maxDigit + 10;
                int temp[] = new int[maxDigit];

                // copying the existing array(digits) into new array(temp)
                System.arraycopy(digits, 0, temp, 0, digits.length);

                // reassign digits array to the new temp array 
                digits = temp;
            }
            digits[idx++] = n % 10;
            n = n / 10;
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
