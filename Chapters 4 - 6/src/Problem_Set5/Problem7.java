package Problem_Set5;

import java.util.Scanner;

public class Problem7
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int input;

        do {
            System.out.println("Enter zero to exit:");
            input = keyboard.nextInt();
        } while (input != 0);
    }
}
