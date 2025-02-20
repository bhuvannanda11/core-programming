import java.util.*;

public class NumCheck {
    public static int solution(int n){
        if(n > 0){
            return 1;
        }
        else if(n == 0){
            return 0;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();

        int ans = solution(n);

        System.out.println("Number "+n+" is :"+ans);

        sc.close();
    }    
}
