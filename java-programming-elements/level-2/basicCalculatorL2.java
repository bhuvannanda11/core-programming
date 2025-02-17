import java.util.*;

public class BasicCalculatorL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of number1 :");
        float number1 = sc.nextFloat();
        System.out.println("Enter the value of number2 :");
        float number2 = sc.nextFloat();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1/number2;

        System.out.print("The addition, subtraction, multiplication and division value "); 
        System.out.println("of 2 numbers : "+addition+", "+subtraction+", "+multiplication+" and "+division);


        sc.close();
    }
}
