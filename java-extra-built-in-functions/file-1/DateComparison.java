import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ask the user to input two dates
        System.out.print("Enter the first date (YYYY-MM-DD): ");
        String inputDate1 = sc.nextLine();
        
        System.out.print("Enter the second date (YYYY-MM-DD): ");
        String inputDate2 = sc.nextLine();
        
        // Convert the input strings to LocalDate objects
        LocalDate date1 = LocalDate.parse(inputDate1);
        LocalDate date2 = LocalDate.parse(inputDate2);
        
        // Compare the two dates
        if (date1.isBefore(date2)) {
            System.out.println("The first date is before the second date.");
        } 
        else if (date1.isAfter(date2)) {
            System.out.println("The first date is after the second date.");
        } 
        else if (date1.isEqual(date2)) {
            System.out.println("The first date is the same as the second date.");
        }
        
        sc.close();
    }
}
