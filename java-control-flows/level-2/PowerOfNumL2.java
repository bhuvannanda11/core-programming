import java.util.*;
public class PowerOfNumL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        int power = sc.nextInt();
        int result = 1;

        for (int i = 1;i <= power; i++) {
            result *= base;
        }
        System.out.println(base + " raised to the power " + power + " is: " + result);
        sc.close();
    }
}
