import java.util.Arrays;

public class AvgMinMax {
    
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return numbers;  
    }


    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            min = Math.min(min, numbers[i]);  
            max = Math.max(max, numbers[i]);  
        }
        
        
        double average = sum / numbers.length;
        
        
        return new double[] {average, min, max};
    }

    public static void main(String[] args) {
        int numbers[] = generate4DigitRandomArray(5);

        double result[] = findAverageMinMax(numbers);        

        System.out.println("Average: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }
}