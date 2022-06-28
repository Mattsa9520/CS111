package Problem_Set7;

import java.util.Random;
import java.util.Scanner;

public class Example1
{
    public static double calcDistance(double time)
    {
        double result = 0.5 * 9.8 * Math.pow(time, 2.0);
        return result;
    }

    public static boolean isPrime(int num)
    {
        if (num == 1)
        {
            return false;
        }

        for (int i = 2; i < num; i++)
        {
            if (num % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    public static String getUserChoice(Scanner keyboard)
    {
        String input;

        do
        {
            System.out.println("Enter paper, rock, or scissors");
            input = keyboard.nextLine();

        } while (!input.equals("paper") && !input.equals("rock") && !input.equals("scissors"));

        return input;
    }

    public static String getComputerChoice()
    {
        Random rng = new Random();
        int num = rng.nextInt(3);

        if (num == 0)
        {
            return "paper";
        } else if (num == 1)
        {
            return "rock";
        } else
        {
            return "scissors";
        }
    }

    public static void showWinner(String input, String computer)
    {
        System.out.println("Comptuer selected: " + computer);

        if (input.equals("rock") && computer.equals("scissors") || input.equals("paper") && computer.equals("rock")
        || input.equals("scissors") && computer.equals("paper"))
        {
            System.out.println("HUMANS WIN! Good job! +1 for humanity");
        } else if (input.equals(computer))
        {
            System.out.println("Tie.");
        } else {
            System.out.println("Rise of the machines! Computer wins!");
        }
    }
}
