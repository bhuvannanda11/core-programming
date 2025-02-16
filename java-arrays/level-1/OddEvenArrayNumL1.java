import java.util.*;
public class OddEvenArrayNumL1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();
        if(n <= 0){
            System.out.println("Error (Not a natural number)");
            return;
        }
        
        int evenNum[] = new int[n / 2+1];
        int oddNum[] = new int[n / 2+1];

        int evenIdx = 0;
        int oddIdx = 0;
        for(int i=1;i<=n;i++){
            if(i % 2 == 0){
                evenNum[evenIdx++] = i;
            }
            else{
                oddNum[oddIdx++] = i; 
            }
        }

        System.out.println("Even Numbers are :");
        for(int i=0;i<evenIdx;i++){
            System.out.println(evenNum[i]+" ");
        }

        System.out.println("Odd Numbers are :");
        for(int i=0;i<oddIdx;i++){
            System.out.println(oddNum[i]+" ");
        }

        sc.close();
    }
}
