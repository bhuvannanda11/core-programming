import java.util.*;
public class SpringSeasonL1 {

    public static boolean solution(int month,int day){
        if((day>=20 && month == 3) || month == 4 || month ==5 || (month == 6 && day <=20)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month :");
        int month = sc.nextInt();
        System.out.println("Enter day :");
        int day = sc.nextInt();

        boolean sol = solution(month,day);
        if(sol == true){
            System.out.println("Spring Season");
        }
        else{
            System.out.println("Not a Spring Season");
        }
        
        sc.close();
    }
}
