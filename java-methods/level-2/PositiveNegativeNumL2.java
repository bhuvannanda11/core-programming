import java.util.Scanner;

public class PositiveNegativeNumL2{
    public static String isPositive(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";  
        }
    }

    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } 
        else {
            return "Odd";
        }
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;  
        } 
        else if (num1 == num2) {
            return 0;
        } 
        else {
            return -1; 
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int numbers[] = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            String positivity = isPositive(number);
            
            if (positivity.equals("Positive")) {
                String evenOdd = isEven(number);
                System.out.println(", " + evenOdd);
            } 
            else {
                System.out.println();
            }
        }

        int comparisonResult = compare(numbers[0], numbers[4]);

        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == 0) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }

        sc.close();
    }
}
