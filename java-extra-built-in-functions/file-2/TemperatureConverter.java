import java.util.*;

public class TemperatureConverter {

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask the user to choose the conversion type
        System.out.println("Temperature Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Choose an option (1 or 2): ");
        int choice = sc.nextInt();

        // Variable to store the temperature value
        double temperature, convertedTemperature;

        if (choice == 1) {
            // Fahrenheit to Celsius conversion
            System.out.print("Enter temperature in Fahrenheit: ");
            temperature = sc.nextDouble();
            convertedTemperature = fahrenheitToCelsius(temperature);
            System.out.println(temperature + " Fahrenheit is equal to " + convertedTemperature + " Celsius.");
        } 
        else if (choice == 2) {
            // Celsius to Fahrenheit conversion
            System.out.print("Enter temperature in Celsius: ");
            temperature = sc.nextDouble();
            convertedTemperature = celsiusToFahrenheit(temperature);
            System.out.println(temperature + " Celsius is equal to " + convertedTemperature + " Fahrenheit.");
        } 
        else {
            // Invalid choice
            System.out.println("Invalid choice. Please run the program again.");
        }


        sc.close();
    }
}
