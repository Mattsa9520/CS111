package Problem_Set3;

import java.util.Scanner;

public class Problem5
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a name");
        String name = keyboard.nextLine();

        System.out.println("Enter an age");
        int age = keyboard.nextInt();

        System.out.println("Enter a city");
        // Clear keyboard buffer of '\n'
        keyboard.nextLine();
        String city = keyboard.nextLine();

        System.out.println("Enter the name of a college");
        String college = keyboard.nextLine();

        System.out.println("Enter a profession");
        String profession = keyboard.nextLine();

        System.out.println("Enter an animal");
        String animal = keyboard.nextLine();

        System.out.println("Enter a pet name");
        String petName = keyboard.nextLine();

        System.out.println("Here's your story");
        System.out.println("There was once someone named " + name + " who lived in " + city + ".");
        System.out.println("At the age of " + age + ", " + name + " went to college at " + college + ".");
        System.out.println("After 4 years, " + name + " was " + (age + 4) + ".");
        System.out.println(name + " then graduated and went to work as a " + profession + ".");
        System.out.println("Then, " + name + " adopted a(n) " + animal + " named " + petName + ".");
        System.out.println("They both lived happily ever after!");
    }
}
