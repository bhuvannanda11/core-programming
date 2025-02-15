import java.util.*;
public class RocketLaunch01L1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();

        while(counter > 0){
            System.out.print(counter+" ");
            counter--;
        }

        sc.close();
    }
}
