import java.util.*;

public class SubstringOccurence {
    public static int countOccurrences(String str, String sub) {
        int count = 0;
        int idx = 0;
        
        // Loop until the substring is found
        while ((idx = str.indexOf(sub, idx)) != -1) {
            count++;    // Increment count when substring is found
            idx++;    // Move the index to continue searching
        }
        
        return count; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Enter the main string: ");
        String mainString = sc.nextLine();
        
        System.out.print("Enter the substring: ");
        String substring = sc.nextLine();
        

        int result = countOccurrences(mainString, substring);
        System.out.println(result);
        
        sc.close();
        }
}
