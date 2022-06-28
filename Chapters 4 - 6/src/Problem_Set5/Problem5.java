package Problem_Set5;

import java.util.Scanner;

public class Problem5
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int x;
        int total = 0;

        System.out.println("Enter a positive, non-zero integer");
        x = keyboard.nextInt();

        if (x < 1)
        {
            if (x == 0)
            {
                System.out.println("Hey, I said non-zero");
            } else {
                System.out.println("Hey, I said positive");
            }

            System.exit(0);
        }

        for (int i = 1; i <= x; i++)
        {
            total += i;
        }

        System.out.println("Sum of numbers from 1 to " + x + " is " + total);
    }
}
