package Problem_Set3;

import java.util.Scanner;

public class Problem3
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What's your favorite city?");
        String city = keyboard.nextLine();

        System.out.println("Number of characters: " + city.length());
        System.out.println("First character: " + city.charAt(0));
        System.out.println("Uppercase: " + city.toUpperCase());
        System.out.println("Lowercase: " + city.toLowerCase());
    }
}
