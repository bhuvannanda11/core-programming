import java.util.*;
public class ChocolatesL1 {
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int[] result = new int[2];  
        result[0] = numberOfChocolates / numberOfChildren;
        result[1] = numberOfChocolates % numberOfChildren; 
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfChocolates = sc.nextInt();
        int numOfChildren = sc.nextInt();

        int result[] = findRemainderAndQuotient(0, 0);
        System.out.println("Each child gets: "+result[0]+" chocolates.");
        System.out.println("Remaining chocolates: "+result[1]);

        sc.close();
        
    }
}
