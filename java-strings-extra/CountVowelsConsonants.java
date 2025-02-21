import java.util.*;
public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int countVowels = 0;
        int countConsonants = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);


            if(ch =='a' || ch =='e' ||ch =='i' || ch=='o' || ch == 'u'){
                countVowels++;
            }
            else if(ch >='a' && ch <= 'z'){
                countConsonants++;
            }
        }

        System.out.println("Number of vowels are "+countVowels);
        System.out.println("Number of consonants are "+countConsonants);

        sc.close();
    }
}
