package Problem_Set12;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Example
{
    public static boolean isValidLicensePlate(String in)
    {
        boolean result = true;

        if (in.length() != 7)
        {
            return false;
        }

        // check first character
        if (!Character.isDigit(in.charAt(0)))
        {
            result = false;
        }

        // checking the next three
        for (int i = 1; i <= 3; i++)
        {
            if(!Character.isLetter(in.charAt(i)))
            {
                result = false;
            }
        }

        for (int i = 4; i <= 6; i++)
        {
            if (!Character.isDigit(in.charAt(i)))
            {
                result = false;
            }
        }

        return result;
    }

    public static String format(String phone)
    {
        StringBuilder b = new StringBuilder(phone);
        b.insert(6, '-');
        b.insert(3, ") ");
        b.insert(0, "(");

         return b.toString();
    }

    public static String unformat(String phone)
    {
        StringBuilder b = new StringBuilder(phone);
        b.deleteCharAt(0);
        b.deleteCharAt(3);
        b.deleteCharAt(3);
        b.deleteCharAt(6);

        return b.toString();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a country");
        String input = keyboard.nextLine();

        ArrayList<Person> data = Person.loadDatabase();
        int numMatches = 0;
        for (Person current : data)
        {
            if (current.livesIn(input))
            {
                numMatches++;
                System.out.println(current);
            }
        }

        System.out.println("Number of matches: " + numMatches);
    }
}
