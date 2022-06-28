package Problem_Set9;

import java.util.Scanner;

public class EnterNamesMod
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

        // prompt user for their best friend, show them their best friend.
        System.out.println("Which friend is your best friend? (Enter an integer)");
        int bestFriend = keyboard.nextInt() - 1;
        System.out.println(names[bestFriend] + "? Yes, " + names[bestFriend] + " is awesome");
    }
}
