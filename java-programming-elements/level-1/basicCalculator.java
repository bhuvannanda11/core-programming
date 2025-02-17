import java.util.*;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of num1 & num2 :");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();

        float addition = num1 + num2;
        float subtraction = num1 - num2;
        float multiplication = num1 * num2;
        float division = num1/num2;
        

        System.out.print("The addition, subtraction, multiplication and division value "); 
        System.out.println("of 2 numbers : "+addition+", "+subtraction+", "+multiplication+" and "+division);

        sc.close();
    }
}
