import java.util.*;

public class LeapYearL2 {

    public static boolean isLeapYear(int year) {
        if (year >= 1582) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true; 
            }
            else {
                return false; 
            }
        } else {
            System.out.println("Year should be greater than or equal to 1582");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } 
        else {
            System.out.println(year + " is not a Leap Year.");
        }

        sc.close();
    }
}
