package Problem_Set7;

import Problem_Set7.Validate;

import java.util.Scanner;

public class ValidateDemo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String name = Validate.getName(keyboard);
        System.out.println("Validated name: " + name);

    }
}
