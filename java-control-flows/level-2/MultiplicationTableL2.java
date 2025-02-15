import java.util.*;
public class MultiplicationTableL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();

        for(int i=6;i<=9;i++){
            System.out.println(num+" * "+i+" = "+(num*i));
        }

        sc.close();
    }
}
