import java.util.*;

public class BMI_L2 {
    
    static void findBMI(double[][] persons) {
        for (int i = 0; i < persons.length; i++) {

            double weight = persons[i][0];
            double height = persons[i][1] / 100;
            double bmi = weight / (height * height);
            persons[i][2] = bmi;
        }
    }
    static String[] findBMIStatus(double[][] persons) {

        String[] status = new String[persons.length];
        for (int i = 0; i < persons.length; i++) {
            double bmi = persons[i][2];
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 24.9 && bmi < 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }
        return status;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double persons[][] = new double[10][3];

        for (int i = 0; i < persons.length; i++) {
            System.out.println("Enter weight of person " + (i + 1) + " in kg: ");
            persons[i][0] = sc.nextDouble();
            System.out.println("Enter height of person " + (i + 1) + " in cm: ");
            persons[i][1] = sc.nextDouble();
        }
        findBMI(persons);

        String[] status = findBMIStatus(persons);


        for (int i = 0; i < persons.length; i++) {
            System.out.println("Person " + (i + 1) + " weight: " + persons[i][0] + " kg, height: " + persons[i][1] + " cm, BMI: " + persons[i][2] + ", Status: " + status[i]);
        }
    }
}
