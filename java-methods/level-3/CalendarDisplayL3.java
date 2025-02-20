import java.util.*;

public class CalendarDisplayL3 {

    // Array to store names of the months
    private static String[] monthNames = {
        "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
    };

    // Array to store the number of days in each month (index 0 for January, 1 for February, etc.)
    private static int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


    // Method to check if a year is a leap year
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the first day of the month (0=Sunday, 1=Monday, ..., 6=Saturday)
    private static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;
        return d0;
    }

    // Method to print the calendar for the month
    private static void printCalendar(int month, int year, int firstDay) {
        System.out.println("\n" + monthNames[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print leading spaces for the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        int daysInCurrentMonth = daysInMonth[month - 1];
        for (int day = 1; day <= daysInCurrentMonth; day++) {
            System.out.printf("%3d ", day);
            if ((firstDay + day) % 7 == 0) {
                System.out.println(); // New line after Saturday
            }
        }

        // Print a new line at the end if the last line is not complete
        if ((firstDay + daysInCurrentMonth) % 7 != 0) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for month and year
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        // Check for leap year for February
        if (isLeapYear(year)) {
            daysInMonth[1] = 29; // February has 29 days in a leap year
        }

        // Get the first day of the month using the Gregorian calendar algorithm
        int firstDay = getFirstDayOfMonth(month, year);

        // Print the calendar
        printCalendar(month, year, firstDay);

        sc.close();
    }
}
