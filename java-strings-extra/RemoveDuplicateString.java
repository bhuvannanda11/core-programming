import java.util.*;
public class RemoveDuplicateString {

    public static String removeDuplicates(String str){
        String ans = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            //Check if the character is already in the result string
            if(ans.indexOf(ch) == -1){
                ans += ch;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String ans = removeDuplicates(str);

        System.out.println("String Without removing Duplicates is :"+str);
        System.out.println("String after removing Duplicates is :"+ans);

        sc.close();
    }
}
