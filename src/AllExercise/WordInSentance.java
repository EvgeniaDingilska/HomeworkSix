package AllExercise;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordInSentance {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please write sentence");

        int number = countWordsUsingStringTokenizer(in.nextLine());
        System.out.println("There are " + number + " words");
    }
    public static int countWordsUsingStringTokenizer(String sentence)
    {
        if (sentence == null || sentence.isEmpty())
        {
            return 0;
        }
        StringTokenizer tokens = new StringTokenizer(sentence);
        return tokens.countTokens();
    }
}
