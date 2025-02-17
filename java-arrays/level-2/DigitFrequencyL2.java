import java.util.*;
public class DigitFrequencyL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        int frequency[] = new int[10];


        long temp = n;
        while (temp > 0) {
            int digit = (int) (temp % 10); 
            frequency[digit]++; 
            temp = temp / 10; 
        }

        System.out.println("Digit Frequency: ");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }

        sc.close();
    }
    
}
