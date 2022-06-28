package Problem_Set9;

import java.util.Scanner;

public class EnterIntegers
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int[] numList = new int[20];
        System.out.println("How many integers do you have? (Max 20)");
        int nums = keyboard.nextInt();

        for (int i = 0; i < nums; i++)
        {
            System.out.println("Enter element for subscript " + i);
            numList[i] = keyboard.nextInt();
        }

        System.out.println("Here are all of those numbers");
        for (int i = 0; i < nums; i++)
        {
            System.out.println(numList[i]);
        }
    }
}
