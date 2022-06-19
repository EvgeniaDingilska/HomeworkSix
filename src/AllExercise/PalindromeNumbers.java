package AllExercise;

import java.util.Scanner;

public class PalindromeNumbers {
    public static void main(String[] args) {

        int rem, rev= 0, temp;
        Scanner in = new Scanner(System.in);
        System.out.println("Please write number: ");
        var n = in.nextInt();
        temp = n;

        while( n != 0 )
        {
            rem= n % 10;
            rev= rev * 10 + rem;
            n=n/10;
        }

        if (temp == rev)
            System.out.println(temp + " is a palindrome.");
        else
            System.out.println(temp + " is not a palindrome.");
    }
}

