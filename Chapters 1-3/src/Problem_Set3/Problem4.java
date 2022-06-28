package Problem_Set3;

import java.util.Scanner;

public class Problem4
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many batches of cookies do you want?");
        int batches = keyboard.nextInt();
        int cookies = batches * 48;
        double sugarCups = batches * 1.5;
        double butterCups = batches;
        double flourCups = batches * 2.75;

        System.out.println(batches + " batches? That's " + cookies + " cookies.");
        System.out.println("Alright, here is what you need");
        System.out.println(sugarCups + " cups of sugar");
        System.out.println(butterCups + " cup of butter");
        System.out.println(flourCups + " cups of flour");
    }
}
