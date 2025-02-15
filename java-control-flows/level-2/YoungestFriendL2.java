import java.util.*;
public class YoungestFriendL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age and height: ");
        int age1 = sc.nextInt();
        double height1 = sc.nextDouble();
        System.out.print("Enter Akbar's age and height: ");
        int age2 = sc.nextInt();
        double height2 = sc.nextDouble();
        System.out.print("Enter Anthony's age and height: ");
        int age3 = sc.nextInt();
        double height3 = sc.nextDouble();

        int youngestAge = Math.min(age1,Math.min(age2,age3));
        double tallestHeight = Math.max(height1,Math.max(height2,height3));

        String youngest;
        String tallest;

        if(youngestAge == age1){
            youngest = "Amar";
        } 
        else if(youngestAge == age2){
            youngest = "Akbar";
        }
        else {
            youngest = "Anthony";
        }


        if (tallestHeight == height1){
            tallest = "Amar";
        } 
        else if (tallestHeight == height2){
            tallest = "Akbar";
        } 
        else{
            tallest = "Anthony";
        }
        
        System.out.println("The youngest friend is: " +youngest);
        System.out.println("The tallest friend is: " +tallest);

        sc.close();
    }
}
