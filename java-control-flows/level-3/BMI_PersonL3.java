import java.util.*;
public class BMI_PersonL3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weight = sc.nextDouble();
        double height = sc.nextDouble();

        height /= 100; // Convert cm to meters
        double bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);

        if(bmi < 18.5){
            System.out.println("Underweight");
        } 
        else if(bmi >= 18.5 && bmi < 24.9){
            System.out.println("Normal weight");
        } 
        else if(bmi >= 25 && bmi < 29.9){
            System.out.println("Overweight");
        } 
        else{
            System.out.println("Obese");
        }

        
        sc.close();
    }
}
