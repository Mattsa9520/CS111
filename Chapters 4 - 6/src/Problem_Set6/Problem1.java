package Problem_Set6;

import java.util.Locale;
import java.util.Scanner;

public class Problem1
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int endValue;
        String upDown;
        boolean goodUpDown = false;

        System.out.println("Enter an ending value");
        endValue = keyboard.nextInt();

        // clear newline
        keyboard.nextLine();

        do {
            System.out.println("Count up or down?");
            upDown = keyboard.nextLine();
            if (upDown.equalsIgnoreCase("up") || upDown.equalsIgnoreCase("down"))
            {
                goodUpDown = true;
            }
        } while (!goodUpDown);

        if (upDown.equalsIgnoreCase("up"))
        {
            for (int i = 1; i <= endValue; i++)
            {
                System.out.printf("%5d %4d %4d\n", i, (i + 10), (i + 100));
            }
        } else if (upDown.equalsIgnoreCase("down"))
        {
            for (int i = 1; i <= endValue; i++)
            {
                System.out.printf("%5d %4d %4d\n", -i, (-i + 10), (-i + 100));
            }
        }
    }
}
