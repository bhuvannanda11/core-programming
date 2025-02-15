import java.util.*;

public class CalculatorUsingSwitchL3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number :");
        double first = sc.nextDouble();
        System.out.print("Enter an operator from the following(+, -, *, /) :");
        char op = sc.next().charAt(0);
        System.out.println("Enter second Number :");
        double second = sc.nextDouble();

        double result;
        switch(op){
            case '+':
                result = first + second;
                System.out.println("Result: "+result);
                break;
            case '-':
                result = first - second;
                System.out.println("Result: "+result);
                break;
            case '*':
                result = first * second;
                System.out.println("Result: "+result);
                break;
            case '/':
                result = first / second;
                System.out.println("Result: "+result);
                break;
            default:
                System.out.println("Invalid Operator!");
        }

        sc.close();
    }    
}
