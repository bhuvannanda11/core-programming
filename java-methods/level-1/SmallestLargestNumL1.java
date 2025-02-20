import java.util.*;
public class SmallestLargestNumL1 {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int result[] = new int[2];
        result[0] = Math.min(number1, Math.min(number2, number3));
        result[1] = Math.max(number1, Math.max(number2, number3));
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int result[] = findSmallestAndLargest(num1, num2, num3);

        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);

        sc.close();
    }
    
}
