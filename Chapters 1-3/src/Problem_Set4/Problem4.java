package Problem_Set4;

import java.util.Scanner;

public class Problem4
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int hour, minute, second;


        System.out.println("Enter a time value in the following format: HH MM SS");
        hour = keyboard.nextInt();
        minute = keyboard.nextInt();
        second = keyboard.nextInt();

        if (hour < 0 || hour > 23)
        {
            System.out.print("Hour must be between 0 and 23 inclusive.");
        } else
        {
            if (hour >= 12)
            {
                // hour -= 12 == (hour = hour - 12)
                if (hour != 12)
                {
                    hour -= 12;
                }
                System.out.printf("%02d:%02d:%02dPM\n", hour, minute, second);
            } else
            {
                if (hour == 0)
                {
                    hour = 12;
                }
                System.out.printf("%02d:%02d:%02dAM\n", hour, minute, second);
            }
        }
    }
}
