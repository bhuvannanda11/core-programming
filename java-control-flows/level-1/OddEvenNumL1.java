import java.util.*;
public class OddEvenNumL1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i =1;i<=num;i++){
            if(i % 2 == 0){
                System.out.println(i+" is even number");
            }
            else{
                System.out.println(i+" is odd number");
            }
        }


        sc.close();
    }
}
