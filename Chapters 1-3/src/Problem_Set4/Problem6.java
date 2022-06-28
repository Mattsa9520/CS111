package Problem_Set4;

import java.util.Scanner;

public class Problem6
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        // Capture required inputs
        System.out.println("== BMI Calculator ==");

        // Step 1
        System.out.println("Step 1: Enter height");
        System.out.println("Feet:");
        int feet = keyboard.nextInt();
        System.out.println("Inches:");
        int inches = keyboard.nextInt();

        // Step 2
        System.out.println("Step 2: Enter weight");
        System.out.println("Pounds:");
        int pounds = keyboard.nextInt();

        // Calculate BMI and output to user
        float heightInInches = (feet * 12F) + inches;
        float bmi = ((pounds / heightInInches) / heightInInches) * 703F;

        // decide person's BMI category
        if (bmi > 29.9F)
        {
            System.out.printf("BMI: %.1f, you are obese.\n", bmi);
        } else if (bmi <= 29.9F && bmi >= 25.0F)
        {
            System.out.printf("BMI: %.1f, you are overweight.\n", bmi);
        } else if (bmi <= 24.9F && bmi >= 18.5F)
        {
            System.out.printf("BMI: %.1f, you are normal.\n", bmi);
        } else if (bmi < 18.5F)
        {
            System.out.printf("BMI: %.1f, you are underweight.\n", bmi);
        }
    }
}
