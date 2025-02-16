import java.util.*;
public class MeanHeightL1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double heights[] = new double[11];
        double sum = 0.0;

        System.out.println("Enter the heights of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }
        System.out.println("Sum of all elements present in the array is: "+sum);
        //formula to calculate the mean is: mean = sum of all elements / number of elements
        double mean = sum / heights.length;
        System.out.println("The mean height of the football team is: "+mean);

        sc.close();
    }
}
