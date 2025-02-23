import java.time.*;
import java.util.*;

public class DateArithmetic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date (YYYY-MM-DD): ");
        String str = sc.nextLine();
        
        // Convert the input string to a LocalDate object
        LocalDate date = LocalDate.parse(str);
        
        // Add 7 days, 1 month, and 2 years to the date
        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2);
        
        // Subtract 3 weeks from the new date
        newDate = newDate.minusWeeks(3);
        

        System.out.println("New date after additions and subtraction: " + newDate);
        
        sc.close();
    }
}
