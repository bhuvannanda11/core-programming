import java.util.*;
public class LargestOfThreeL1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        System.out.println("Is the first number "+num1 +" the largest? "+(num1>num2 && num1> num3));
        System.out.println("Is the second number "+num2 +" the largest? "+(num2>num1 && num2> num3));
        System.out.println("Is the third number "+num3 +" the largest? "+(num3>num1 && num3> num2));


        sc.close();
    }
}
