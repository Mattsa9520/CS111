package Problem_Set2;

import java.util.Scanner;

public class Example
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age, newAge;

        System.out.println("How old are you?");
        age = keyboard.nextInt();
        // clear keyboard buffer of '\n'
        keyboard.nextLine();
        System.out.println("What's your name?");
        name = keyboard.nextLine();
        newAge = age + 10;

        System.out.println(name + " will be " + newAge + " in ten years.");
    }
}
