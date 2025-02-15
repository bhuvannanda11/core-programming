import java.util.*;
public class numOfHandshake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int handshake = (n * (n-1)/2);

        System.out.println("The number of possible handshakes :"+handshake);

        sc.close();
    }
}
