import java.util.*;

public class ToggleCase {
    
    public static String toggleCase(String str) {
        String result = ""; 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            }
            else if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            }
            // If it's neither a special character, append it as is
            else {
                result += ch;
            }
        }
        
        return result; 
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String inputString = sc.nextLine();
        String ans = toggleCase(inputString);
        
        System.out.println("Toggled case string: " + ans);
        
        sc.close();
    }
}
