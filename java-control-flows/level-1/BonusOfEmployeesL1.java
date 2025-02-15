import java.util.*;
public class BonusOfEmployeesL1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int years = sc.nextInt();
        double salary = sc.nextDouble();

        if(years > 5){
            //bonus of 5% to employees whose year of service is more than 5 years.
            double bonus = salary * 0.05;
            System.out.println("Bonus amount is :"+bonus);
        }
        else{
            System.out.println("No bonus as years of service is less than or equal to 5 years");
        }


        sc.close();
    }
}
