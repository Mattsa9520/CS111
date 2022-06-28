package Problem_Set2;

import java.util.Scanner;

public class Problem2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double input, total;

        System.out.println("Enter an integer");
        input = keyboard.nextDouble();
        total = input + 1.0;
        System.out.println(input + " + " + 1.0 + " = " + total);
    }
}
