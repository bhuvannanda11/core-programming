import java.util.Scanner;

public class WordReplace {

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter the word to replace: ");
        String oldWord = sc.nextLine();

        // Input new word to replace with
        System.out.print("Enter the new word: ");
        String newWord = sc.nextLine();

        // Replace the word in the sentence
        String ans = replaceWord(sentence, oldWord, newWord);

        // Display the modified sentence
        System.out.println("Modified Sentence: " + ans);


        sc.close();
    }
}
