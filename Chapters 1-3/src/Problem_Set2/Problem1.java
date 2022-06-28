package Problem_Set2;

import java.util.Scanner;

public class Problem1
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int input, total;

        System.out.println("Enter an integer");
        input = keyboard.nextInt();
        total = input + 1;
        System.out.println(input + " + " + 1 + " = " + total);
    }
}
