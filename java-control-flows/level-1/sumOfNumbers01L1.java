import java.util.*;
public class sumOfNumbers01L1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        double num = sc.nextDouble();
        // Enter number 0 to stop:
        while(num != 0){
            sum +=num;
        }
        System.out.println("Total sum: "+sum);

        sc.close();
    }
}
