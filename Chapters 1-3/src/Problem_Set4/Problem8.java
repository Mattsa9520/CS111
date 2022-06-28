package Problem_Set4;

import java.util.Scanner;

public class Problem8
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        // Capture user input
        System.out.println("Enter number of seconds");
        int seconds = keyboard.nextInt();

        int minutes, hours, days, rSeconds, rMinutes, rHours, rDays;

        // convert seconds to minutes, hours, and days.
        // Using integers will automatically convert to the necessary whole numbers for
        // each value.
        minutes = seconds / 60;
        hours = minutes / 60;
        days = hours / 24;

        // find the remainder of seconds, minutes, and hours.
        // These are the subsequent values displayed for a given time in seconds.
        // Ex. 65 seconds = 1 minute and 5 seconds.
        // int minutes = 1; int rSeconds = 5;
        rSeconds = seconds % 60;
        rMinutes = minutes % 60;
        rHours = hours % 24;

        // find desired output
        if (seconds < 60)
        {
            System.out.println(seconds + " second(s)");
        } else if (minutes < 60)
        {
            // if remainder variables are zero the program doesn't need to display them
            if (rSeconds == 0) {
                System.out.println(minutes + " minute(s)");
            }
            else {
                System.out.println(minutes + " minute(s)");
                System.out.println(rSeconds + " second(s)");
            }
        } else if (hours < 24)
        {
            if (rMinutes == 0 && rSeconds == 0)
            {
                System.out.println(hours + " hour(s)");
            } else if (rMinutes == 0 && rSeconds != 0)
            {
                System.out.println(hours + " hour(s)");
                System.out.println(rSeconds + " second(s)");
            } else
            {
                System.out.println(hours + " hour(s)");
                System.out.println(rMinutes + " minute(s)");
                System.out.println(rSeconds + " second(s)");
            }
        } else
        {
            if (rHours == 0 && rMinutes == 0 && rSeconds == 0)
            {
                System.out.println(days + " day(s)");
            } else if (rHours == 0 && rMinutes == 0 && rSeconds != 0)
            {
                System.out.println(days + " day(s)");
                System.out.println(rSeconds + " second(s)");
            } else if (rHours == 0 && rMinutes != 0 && rSeconds != 0)
            {
                System.out.println(days + " day(s)");
                System.out.println(rMinutes + " minute(s)");
                System.out.println(rSeconds + " second(s)");
            } else
            {
                System.out.println(days + " day(s)");
                System.out.println(rHours + " hour(s)");
                System.out.println(rMinutes + " minute(s)");
                System.out.println(rSeconds + " second(s)");
            }
        }
    }
}
