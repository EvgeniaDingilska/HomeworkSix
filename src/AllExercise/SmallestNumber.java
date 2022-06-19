package AllExercise;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input word: ");
        String x = in.nextLine();

        System.out.println(MiddleChar(x));
    }
    public static String MiddleChar(String x)
    {
        char firstMiddleLetter = x.charAt(x.length()/2);
        if (x.length()%2 == 0){
            char secondMiddleLetter = x.charAt((x.length()/2)+1);
            return firstMiddleLetter +" "+secondMiddleLetter;
        }

        return firstMiddleLetter + " ";
    }
}
