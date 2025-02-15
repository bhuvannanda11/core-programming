import java.util.*;
public class sumOfNumbers02L1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        double num = sc.nextDouble();
        while(true){
            if(num <=0) break;
            sum += num;
        }
        
        System.out.println("Total sum: " +sum);

        sc.close();
    }
}
