import java.util.*;
public class PCm_avg_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of maths, physics and chemistry :");
        int maths = sc.nextInt();
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();

        float avg = (maths + physics + chemistry)/3.0f;

        System.out.println("Sam's average mark in PCM is "+avg);

        sc.close();
    }
    
}
