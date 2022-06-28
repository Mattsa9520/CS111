package Problem_Set2;

import java.util.Scanner;

public class Problem3
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int input, mod;

        System.out.println("Enter an integer");
        input = keyboard.nextInt();
        mod = input % 2;
        System.out.print(input + " mod " + 2 + " = " + mod );
    }
}
