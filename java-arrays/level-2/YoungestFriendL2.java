import java.util.*;
public class YoungestFriendL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String names[] = {"Amar","Akbar","Anthony"};
        int age[] = new int[3];
        double heights[] = new double[3];


        System.out.println("Enter the age and heights of the friends :");
        for(int i=0;i<3;i++){
            age[i] = sc.nextInt();
            heights[i] = sc.nextDouble();
        }

        // Find youngest and tallest
        int youngestIndex = 0, tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) youngestIndex = i;
            if (heights[i] > heights[tallestIndex]) tallestIndex = i;
        }

        System.out.println("Youngest: " + names[youngestIndex]);
        System.out.println("Tallest: " + names[tallestIndex]);
    }
}
