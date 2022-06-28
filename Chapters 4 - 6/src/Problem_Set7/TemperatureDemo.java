package Problem_Set7;

import Problem_Set7.Temperature;

import java.util.Scanner;

public class TemperatureDemo {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Fahrenheit value:");
        double f = keyboard.nextDouble();
        double result = Temperature.convert(f);
        System.out.printf("Equivalent celsius value: %.1f", result);
    }
}
