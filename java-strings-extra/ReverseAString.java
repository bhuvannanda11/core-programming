import java.util.*;
public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int j = 0;
        String s = "";
        char arr[] = new char[str.length()];
        for(int i=str.length() - 1;i>=0;i--){
            s += str.charAt(i);
        }

        System.out.println("Reverse of "+str+" is :"+s);

        sc.close();
    }
}
