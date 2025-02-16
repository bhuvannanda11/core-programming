import java.util.*;
public class FactorsOfNumL1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int maxFactor = 10;
        int arr[] = new int[maxFactor];
        int idx = 0;

        for(int i=1;i<=n;i++){
            if(n % i == 0){ // to check that i is the factor of the number(n)
                
                // resize the array if idx is equal to maxFactor
                if(idx == maxFactor){
                    
                    //To store more elements, reset the maxIndex to twice its size
                    maxFactor = maxFactor*2;
                    
                    // use the temp array to store the elements from the factors array
                    int temp[] = new int[maxFactor];

                    // copying the old factos in the temp array from the arr array
                    for(int j =0;j<arr.length;j++){
                        temp[j] = arr[j];
                    }
                    
                    // assign the factors array(arr) to the temp array
                    arr = temp;
                }

                // storing the factors in the arr array and incrementing the index idx
                arr[idx++] = i;
            }
        }
        
        //Finally, Display the factors of the number
        System.out.println("Factors of "+n+" are :");
        for(int i=0;i<idx;i++){
            System.out.print(arr[i]+" ");
        }


        sc.close();
    }
}
