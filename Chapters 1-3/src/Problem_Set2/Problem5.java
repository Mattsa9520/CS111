package Problem_Set2;

import java.util.Scanner;

public class Problem5
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2, originalNum2, total;

        System.out.println("Enter first number");
        num1 = keyboard.nextInt();
        System.out.println("Enter second number");
        originalNum2 = keyboard.nextInt();

        num2 = originalNum2;
        total = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + total);

        num2 = originalNum2 * 2;
        total = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + total);

        num2 = originalNum2 * 3;
        total = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + total);

        num2 = originalNum2 * 4;
        total = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + total);

        num2 = originalNum2 * 5;
        total = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + total);
    }
}
