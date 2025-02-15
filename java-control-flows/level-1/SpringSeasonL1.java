import java.util.*;
public class SpringSeasonL1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        //Spring Season is from March 20 to June 20

        if((month == 3 && day >=20) || (month ==3 || month==6) || (month ==6 && day <=20)){
            System.out.println("It's a Spring Season");
        }
        else{
            System.out.println("Not a Spring Season");
        }



        sc.close();
    }
}
