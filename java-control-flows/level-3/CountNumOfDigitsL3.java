import java.util.*;
public class CountNumOfDigitsL3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        int num = n;

        while (num != 0) {
            num = 10;
            count++;
        }

        System.out.println(count);

        sc.close();
    }
}
