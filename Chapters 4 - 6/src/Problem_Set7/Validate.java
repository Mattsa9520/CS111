package Problem_Set7;

import java.util.Scanner;

public class Validate
{
    public static String getName(Scanner keyboard)
    {
        String name;

        do
        {
            System.out.println("Enter a name. The name must be in between 5 and 15 characters.");
            name = keyboard.nextLine();
        } while (name.length() < 5 || name.length() > 15);

        return name;
    }
}
