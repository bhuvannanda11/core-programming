import java.util.*;
public class LeapYear01L3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if (year >= 1582) {
            if(year % 4 == 0) {
                if(year % 100 == 0) {
                    if(year % 400 == 0) {
                        System.out.println(year+" is a Leap Year");
                    } 
                    else{
                        System.out.println(year+" is NOT a Leap Year");
                    }
                } 
                else{
                    System.out.println(year+" is a Leap Year");
                }
            } 
            else{
                System.out.println(year+" is NOT a Leap Year");
            }
        } 
        else{
            System.out.println("Year must be 1582 or later");
        }


        sc.close();
    }
}
