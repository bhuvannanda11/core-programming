import java.util.*;
public class harrys_age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the birthYear :");
        int birthYear = sc.nextInt();
        
        System.out.println("Enter the currentYear :");
        int currentYear = sc.nextInt();
        
        int age = currentYear - birthYear;

        System.out.println("Harry's age in 2024 is "+age);

        sc.close();
    }
}