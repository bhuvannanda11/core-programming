import java.util.*;
public class NumIsPosNegZeroL1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the numbers :");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                System.out.println("Number "+arr[i]+" is Zero");
            }
            else if(arr[i] > 0){
                System.out.println("Number "+arr[i]+" is Positive");
            }
            else{
                System.out.println("Number "+arr[i]+" is Negative");
            }
        }

        if(arr[0] == arr[arr.length - 1]){
            System.out.println("First element "+arr[0]+" and last elements "+arr[arr.length -1]+" are equal");
        }
        else if(arr[0] > arr[arr.length - 1]){
            System.out.println("First element "+arr[0]+" is greater than the last element"+arr[arr.length - 1]);
        }
        else{
            System.out.println("First element "+arr[0] +" is less than the last element"+arr[arr.length -1]);
        }


        sc.close();
    }
}