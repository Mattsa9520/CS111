package Problem_Set9;

import java.util.Scanner;

public class EnterNames
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        // list of names
        String[] names = new String[5];

        // caputure input from user
        System.out.println("Enter five names");
        for (int i = 0; i < names.length; i++)
        {
            System.out.println("Enter friend " + (i + 1));
            names[i] = keyboard.nextLine();
        }

        // show use their inputs
        System.out.println("Here are all of those names");
        for (int i = 0; i < names.length; i++)
        {
            System.out.println("Friend " + (i + 1) + " is " + names[i]);
        }
    }
}
