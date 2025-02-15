import java.util.*;
public class MultipleOfNumL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int multipleNum = sc.nextInt();
        System.out.print("Multiples of "+multipleNum+" below 100: ");
        
        for (int i = 100; i >= 1; i--) {
            if (i % multipleNum == 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();


        sc.close();
    }
}
