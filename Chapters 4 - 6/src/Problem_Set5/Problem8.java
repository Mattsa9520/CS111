package Problem_Set5;

import java.util.Scanner;

public class Problem8
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Which direction would you like to move?");
            System.out.println("[8] North");
            System.out.println("[4] West");
            System.out.println("[2] South");
            System.out.println("[6] East");
            System.out.println("[0] Exit");
            choice = keyboard.nextInt();

            if (choice == 8)
            {
                System.out.println("You moved north.");
            } else if (choice == 4)
            {
                System.out.println("You moved west.");
            } else if (choice == 2)
            {
                System.out.println("You moved south.");
            } else if (choice == 6)
            {
                System.out.println("You moved east.");
            }

        } while (choice != 0);
    }
}
