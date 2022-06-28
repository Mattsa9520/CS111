package Problem_Set2;

import java.util.Scanner;

public class Problem4
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double height, base, area;

        System.out.println("Enter base and height separated by a space");
        base = keyboard.nextDouble();
        height = keyboard.nextDouble();
        area = (1.0 / 2.0) * base * height;
        System.out.println("Area: " + area);
    }
}
