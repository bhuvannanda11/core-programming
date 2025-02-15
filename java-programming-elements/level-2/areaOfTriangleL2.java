import java.util.*;
public class areaOfTriangleL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of base :");
        double base = sc.nextDouble();
        System.out.println("Enter the value of height :");
        double heightInches = sc.nextDouble();

        double areaInches = 0.5 * base * heightInches;

        double heightCm = heightInches * 2.54;

        int heightFeet = (int)(heightInches / 12);

        System.out.println("Your height in cm is "+heightCm +" while in feet is "+heightFeet 
        +" and inches is "+heightInches);  


        sc.close();
    }
}
