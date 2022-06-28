package Problem_Set9;

import java.util.Scanner;

public class EnterIntegersMod
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        // list with a max of 20
        int[] numList = new int[20];

        // prompt for number of integers.
        System.out.println("How many integers do you have? (Max 20)");
        int nums = keyboard.nextInt();

        // check if number of integers is within range.
        if (nums < 1 || nums > 20)
        {
            // if not, exit.
            System.out.println("You must enter a number in between 1 and 20");
            System.exit(0);
        } else {
            //if so, enter integers.
            for (int i = 0; i < nums; i++)
            {
                System.out.println("Enter element for subscript " + i);
                numList[i] = keyboard.nextInt();
            }

            //show user their integers.
            System.out.println("Here are all of those numbers");

            for (int i = 0; i < nums; i++)
            {
                System.out.println(numList[i]);
            }
        }
    }
}
