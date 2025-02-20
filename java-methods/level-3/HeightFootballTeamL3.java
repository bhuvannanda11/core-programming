import java.util.*;

public class HeightFootballTeamL3 {

    public static int sumOfHeights(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double meanHeight(int[] heights) {
        int sum = sumOfHeights(heights);
        return sum / (double) heights.length;
    }

    public static int shortestHeight(int[] heights) {
        int minHeight = heights[0];
        for (int height : heights) {
            if (height < minHeight) {
                minHeight = height;
            }
        }
        return minHeight;
    }

    public static int tallestHeight(int[] heights) {
        int maxHeight = heights[0];
        for (int height : heights) {
            if (height > maxHeight) {
                maxHeight = height;
            }
        }
        return maxHeight;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int heights[] = new int[11];


        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + sc.nextInt(101);  
        }


        int sum = sumOfHeights(heights);
        double mean = meanHeight(heights);
        int shortest = shortestHeight(heights);
        int tallest = tallestHeight(heights);


        System.out.println("Football Team Heights (in cm):");
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Player " + (i + 1) + " Height: " + heights[i] + " cm");
        }

        System.out.println("\nResults:");
        System.out.println("Total height sum of all players: " + sum + " cm");
        System.out.println("Mean height of players: " + mean + " cm");
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");


        sc.close();
    }
}
