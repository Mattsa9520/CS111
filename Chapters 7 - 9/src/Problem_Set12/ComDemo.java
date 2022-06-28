package Problem_Set12;

import java.util.Scanner;

public class ComDemo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a String");
        String line = keyboard.nextLine();

        System.out.println("Top level domain: " + DomainParser.getTopLevelDomain(line));
    }
}
