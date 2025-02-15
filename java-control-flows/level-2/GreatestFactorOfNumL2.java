import java.util.*;
public class GreatestFactorOfNumL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //greatest factor of a number beside itself using a loop.
        int n = sc.nextInt();
        int greatestFactor = 1;

        for (int i=n-1; i>=1; i--) {
            if (n%i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("Greatest factor (excluding itself): " + greatestFactor);


        sc.close();
    }
}
