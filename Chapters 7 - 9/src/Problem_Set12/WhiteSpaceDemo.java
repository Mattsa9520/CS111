package Problem_Set12;

import java.util.Scanner;

public class WhiteSpaceDemo
{
    public static void main(String[] args)
    {
        // Get user input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = keyboard.nextLine();

        // check string, keep track of white spaces
        int numWhiteSpaces = 0;
        for (int i = 0; i < input.length(); i++)
        {
            if (Character.isWhitespace(input.charAt(i)))
            {
                numWhiteSpaces++;
            }
        }

        // display number of whitespaces to user
        System.out.println("Number of whitespace characters: " + numWhiteSpaces);
    }
}
