import java.util.*;
public class FactorsOfNumberL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Factors of "+n+" are: ");
        for (int i=1;i<=n;i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();


        sc.close();
    }
}
