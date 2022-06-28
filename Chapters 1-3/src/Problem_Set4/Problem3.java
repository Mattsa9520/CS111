package Problem_Set4;

import java.util.Scanner;

public class Problem3
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your score:");
        int score = keyboard.nextInt();

        if (score >= 7000)
        {
            System.out.print("1UP");
        } else if (score >= 0 && score < 7000)
        {
            int neededPoints = 7000 - score;
            System.out.print("You need " + neededPoints + " more points for a 1UP");
        } else
        {
            System.out.print("You got less than zero?  This score is invalid.");
        }
    }
}
