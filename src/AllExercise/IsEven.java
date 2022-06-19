package AllExercise;

import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = in.nextInt();

        System.out.println("Is the number is even " + IsEven(number));
    }
    public static boolean IsEven (int num)
    {
        return (num % 2 == 0) ? true : false;
    }
}
