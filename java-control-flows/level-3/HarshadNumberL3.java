import java.util.*;
public class HarshadNumberL3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0; 
        int temp = num;

        while (temp > 0) {
            sum = sum +(temp % 10);
            temp = temp / 10;
        }

        if(num % sum == 0){
            System.out.println(num+" is a Harshad Number");
        } 
        else{
            System.out.println(num+" is NOT a Harshad Number");
        }

        sc.close();
    }
}
