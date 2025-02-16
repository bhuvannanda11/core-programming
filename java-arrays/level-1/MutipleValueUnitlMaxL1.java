import java.util.*;
public class MutipleValueUnitlMaxL1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double arr[] = new double[10];
        double total = 0.0;
        int idx = 0;

        System.out.println("Enter numbers :");
        //Enter 0 or a negative number to stop:");
        while (true) {
            double n = sc.nextDouble();
            if (n <= 0 ){
                break;
            }
            if(idx == 10){
                break;
            }
            arr[idx++] = n;
        }

        System.out.println("Stored numbers are :");
        for (int i = 0; i < idx; i++) {
            System.out.print(arr[i] + " ");
            total += arr[i];
        }


        System.out.println("Sum of all numbers: " + total);

        sc.close();
    }
}
