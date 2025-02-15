import java.util.*;
public class PercentageGradeL3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();
        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();

        int total = physics + chemistry + maths;
        double percentage = (total / 3.0);
        System.out.println("Average Marks: " +percentage + "%");

        if(percentage >= 90){
            System.out.println("Grade: A+ (Excellent)");
        } 
        else if(percentage >= 80){
            System.out.println("Grade: A (Very Good)");
        } 
        else if(percentage >= 70){
            System.out.println("Grade: B (Good)");
        } 
        else if(percentage >= 60){
            System.out.println("Grade: C (Average)");
        } 
        else if(percentage >= 50){
            System.out.println("Grade: D (Pass)");
        } 
        else{
            System.out.println("Grade: F (Fail)");
        }

        sc.close();
    }
}
