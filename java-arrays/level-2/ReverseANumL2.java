import java.util.*;
public class ReverseANumL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;

        while(temp != 0){
            count++;
            n = n / 10;
        }

        int digits[] = new int[count];
        temp = n;
        for(int i=0;i<count;i++){
            digits[i] = temp % 10;
            temp = temp/10;
        }

        System.out.print("Reversed Number is :");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]+" ");
        }


        sc.close();
    }
}
