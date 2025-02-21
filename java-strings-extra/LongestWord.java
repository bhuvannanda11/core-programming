import java.util.*;
public class LongestWord {
    public static String wordInSentence(String str){
        String arr[] = str.split(" ");
        String ans = "";

        for(String a :arr){
            if(a.length() > ans.length()){
                ans = a;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String longest = wordInSentence(str);

        System.out.println("The Longest word is :"+longest);


        sc.close();
    }
}
