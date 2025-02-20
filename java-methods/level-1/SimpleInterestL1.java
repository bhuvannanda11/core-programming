import java.util.*;
public class SimpleInterestL1 {

    public static double Solution(double Principle,double Rate,double Time){
        return (Principle*Rate*Time) / 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Principle = sc.nextDouble();
        double Rate = sc.nextDouble();
        double Time = sc.nextDouble();

        double SI = Solution(Principle, Rate, Time);

        System.out.println("The Simple Interest is "+SI+" for Principal "+Principle+", Rate of Interest "+Rate+" and Time "+Time);

        sc.close();
    }
}