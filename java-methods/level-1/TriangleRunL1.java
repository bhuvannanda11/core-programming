import java.util.*;
public class TriangleRunL1 {

    public static int solution(double side,int distanceInMeter){
        // distane 
        return (int)(distanceInMeter / (side+side+side));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distanceInKm = 5;
        int distanceInMeter = 5 * 1000;
        System.out.println("Enter the side of the triangle :");
        double side = sc.nextDouble();   // side in meter


        int ans = solution(side, distanceInMeter);

        System.out.println("Rounds the athlete must complete in 5 km is :"+ans);
        sc.close();
    }
}
