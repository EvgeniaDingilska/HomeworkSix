package AllExercise;

import java.util.Scanner;

public class AverageOfTreeNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the Second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
        System.out.print("The smallest value is " + smallest(x, y, z)+" \n" );
    }
    public static double smallest(double x, double y, double z)
    {
        return x+y+z/3;
    }
}
