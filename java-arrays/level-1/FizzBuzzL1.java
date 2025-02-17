import java.util.*;
public class FizzBuzzL1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();

        if(n <=0){
            System.out.println("Invalid Number");
            return;
        }

        String arr[] = new String[n+1];   //n+1 to include the number itself

        for(int i=0;i<=n;i++){
            if(i % 3 == 0 && i % 5 == 0){
                arr[i] = "FizzBuzz";
            }
            else if(i % 3 == 0){
                arr[i] = "Fizz";
            }
            else if(i % 5 == 0){
                arr[i] = "Buzz";
            }
            else{
                arr[i] = String.valueOf(i);  // to save the number as a string
            }
        }

        // print the array results for each index position in the format
        // Position 1 = 1, …, Position 3 = Fizz,...

        System.out.println("The array result for each index position is :");
        
        for(int i=0;i<=n;i++){
            System.out.println("Position "+i+" = "+arr[i]);
        }


        sc.close();
    }
}