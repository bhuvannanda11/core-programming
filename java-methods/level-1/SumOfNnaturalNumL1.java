import java.util.*;
public class SumOfNnaturalNumL1 {
    public static int solution(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = solution(n);

        System.out.println("Sum of n natural numbers using loop is :"+ans);

        sc.close();

    }

}
