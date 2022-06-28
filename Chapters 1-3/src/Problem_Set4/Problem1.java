package Problem_Set4;

import java.util.Scanner;

public class Problem1
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = keyboard.nextInt();

        if (age >= 35)
        {
            System.out.println(age + "?  You can run for President!");
        } else
        {
            System.out.println(age + "?  You cannot run for President!");
        }
    }
}
