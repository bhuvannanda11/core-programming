import java.util.*;
public class areaOftriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of base :");
        double base = sc.nextDouble();
        System.out.println("Enter the value of height :");
        double heightInches = sc.nextDouble();

        double areaInInches = 0.5 * base * heightInches;

        double heightInCm = heightInches * 2.54;     //1inch = 2.54cm    

        int feet = (int)(heightInches / 12);       // 1foot = 12inches
        
        double inches = (heightInches % 12);


        System.out.println("Your height in cm is "+heightInCm +" while in feet is "+feet 
        +" and inches is "+inches); 
        
    }
}
