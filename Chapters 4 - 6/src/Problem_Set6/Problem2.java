package Problem_Set6;

import java.util.Scanner;

public class Problem2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many dollars will you spend?");
        int dollars = keyboard.nextInt();
        int stars = 0;
        int numCoffees = 0;

        for (int i = 0; i < dollars; i++)
        {
            numCoffees++;
            stars++;
            if (stars == 7)
            {
                numCoffees++;
                stars = 1;
            }
        }

        System.out.println("Coffees: " + numCoffees + "\nStars remaining: " + stars);
    }
}
