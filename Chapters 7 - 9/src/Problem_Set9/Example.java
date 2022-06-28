package Problem_Set9;

import java.util.Scanner;

public class Example
{
    public static void main(String[] args)
    {
        for (String temp : args)
        {
            System.out.println(temp);
        }

        if (args.length == 2)
        {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);

            double sum = num1 + num2;
            System.out.println(sum);
        } else {
            System.out.println("Error: Incorrect number of command line arguments");
            System.out.println("Usage: Java Sum [num1] [num2]");
        }
    }
}
