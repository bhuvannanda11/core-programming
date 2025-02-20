import java.util.*;

public class SubstringComparisonL1 {
    public static String solution(String s, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string for substring: ");
        String str = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        System.out.println("Manual substring: " + solution(str, start, end));
        System.out.println("Built-in substring(): " + str.substring(start, end));

        sc.close();
    }
}
