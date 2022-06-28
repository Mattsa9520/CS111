package Problem_Set4;

import java.util.Scanner;

public class Problem2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int num = keyboard.nextInt();

        if (num % 2 == 0)
        {
            System.out.println(num + " is even.");
        } else
        {
            System.out.println(num + " is odd.");
        }
    }
}
