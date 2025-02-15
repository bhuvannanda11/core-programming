import java.util.*;
public class heightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the height in cm :");
        double heightInCm = sc.nextDouble(); 

        double heightInInch = heightInCm/ 2.54;   // 1inch = 2.54cm

        int feet = (int)(heightInInch / 12);      // 1foot = 12inches
        int inches = (int)(heightInInch % 12);    // % modulus to find out the remainder

        System.out.println("Your Height in cm is "+heightInCm+" while in feet is "+feet +" and inches is "+inches);

    }
}
