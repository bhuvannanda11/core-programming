import java.util.*;

public class MaxNumOfHandShakesL1 {

    public static int Solution(int n){
        return (n * (n-1))/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students :");
        int n = sc.nextInt();

        int NumOfHandShakes = Solution(n);

        System.out.println("The number of Handshakes of "+n+" students is :"+NumOfHandShakes);

        sc.close();
    }
}
