package Problem_Set3;

import java.util.Scanner;

public class Problem1
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("== One Year Interest Calculator ==");

        System.out.println("How much money do you have?");
        double money = keyboard.nextDouble();

        System.out.println("What's the interest rate?");
        double interest = keyboard.nextDouble();

        double interestEarned = money * (interest / 100.0);
        double balance = money + interestEarned;
        System.out.println("Interest earned: $" + interestEarned);
        System.out.println("New balance: $" + balance);

    }
}
