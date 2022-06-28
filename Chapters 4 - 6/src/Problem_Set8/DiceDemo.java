package Problem_Set8;

import java.util.Scanner;

public class DiceDemo
{
    public static void rollDie(Dice first, Dice second)
    {
        System.out.println("Rolling dice...");
        first.roll();
        second.roll();

        System.out.println("First die: " + first.getValue());
        System.out.println("Second die: " + second.getValue());
        int result = first.getValue() + second.getValue();
        System.out.println("Sum: " + result);
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many sides or die 1?");
        int numSides1 = keyboard.nextInt();

        System.out.println("How many sides for die 2?");
        int numSides2 = keyboard.nextInt();

        Dice d1 = new Dice(numSides1);
        Dice d2 = new Dice(numSides2);

        rollDie(d1, d2);
    }
}
