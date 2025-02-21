import java.util.*;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        str1 = str1.toLowerCase();
        String str2 = "";
        for(int i = str1.length() - 1;i>=0;i--){
            str2 += str1.charAt(i);
        }

        if(str1.equals(str2)){
            System.out.println("String is Palindrom");
        }
        else{
            System.out.println("String is not Palindrome");
        }

        sc.close();
    }
}
