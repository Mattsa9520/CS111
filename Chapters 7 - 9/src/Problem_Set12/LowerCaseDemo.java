package Problem_Set12;

import java.util.Scanner;

public class LowerCaseDemo
{
    public static void main(String[] args)
    {
        // get user input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = keyboard.nextLine();

        // create counter, check if each character is lowercase
        int numLowerCase = 0;
        for (int i = 0; i < input.length(); i++)
        {
            if (Character.isLowerCase(input.charAt(i)))
            {
                numLowerCase++;
            }
        }

        // show user number of lowercase characters
        System.out.println("Number of lower case characters: " + numLowerCase);
    }
}
