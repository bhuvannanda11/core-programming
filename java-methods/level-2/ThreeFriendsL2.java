import java.util.*;

public class ThreeFriendsL2 {

    public static String findYoungest(int[] ages, String[] names) {
        int youngestAge = ages[0];
        String youngestName = names[0];
        
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestName = names[i];
            }
        }
        
        return youngestName;
    }


    public static String findTallest(double[] heights, String[] names) {
        double tallestHeight = heights[0];
        String tallestName = names[0];
    
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestName = names[i];
            }
        }
    
        return tallestName;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] names = {"Amar", "Akbar", "Anthony"};
    int[] ages = new int[3];
    double heights[] = new double[3];


    for (int i = 0; i < 3; i++) {
        System.out.print("Enter the age :");
        ages[i] = sc.nextInt();
        System.out.print("Enter the height :");
        heights[i] = sc.nextDouble();
    }

    String youngest = findYoungest(ages, names);
    System.out.println("The youngest friend is: " + youngest);

    String tallest = findTallest(heights, names);
    System.out.println("The tallest friend is: " + tallest);


    sc.close();
    }
}
        