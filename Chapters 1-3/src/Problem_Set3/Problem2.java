package Problem_Set3;

import java.util.Scanner;

public class Problem2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter some text");
        String someText = keyboard.nextLine();
        char firstLetter = someText.charAt(0);
        char lastLetter = someText.charAt(someText.length() - 1);

        System.out.println("You entered: " + someText);
        System.out.println("First letter: " + firstLetter);
        System.out.println("Last letter: " + lastLetter);
    }
}
