package Problem_Set4;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Example
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("==> Paycheck Calculator <==");
        System.out.println("How much do you make per hour?");
        float hourly = keyboard.nextFloat();

        System.out.println("How many hours did you work?");
        float numHours = keyboard.nextFloat();

        float grossPay = hourly * numHours;

        if (numHours > 40)
        {
            grossPay = hourly * 40;
            grossPay += (numHours - 40) * hourly * 1.5F;
        }

        float netPay = grossPay * .8F;

        System.out.println("You worked " + numHours + " hours");
        System.out.printf("Gross Pay: $%.2f\n", grossPay);
        System.out.printf("Net Pay: $%.2f\n", netPay);

    }
}
