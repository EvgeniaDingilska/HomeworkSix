package AllExercise;

import java.util.Scanner;

public class MiddleCharacter {
    public MiddleCharacter(String stringInput) {

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please write the string");
        System.out.println(MiddleCharacterLetters(in.nextLine()));
    }
    public static String MiddleCharacterLetters(String name)
    {
        int lenght = name.length();
        if (lenght%2 == 1)
        {
            return name.charAt((lenght/2)) + " ";
        }
        return name.charAt((lenght/2)-1) + " " + name.charAt((lenght/2));
    }
}
