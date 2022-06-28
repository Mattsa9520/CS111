package Problem_Set7;

import Problem_Set7.Exam;

import java.util.Scanner;

public class ExamDemo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 5 scores");
        double num1 = keyboard.nextFloat();
        double num2 = keyboard.nextFloat();
        double num3 = keyboard.nextFloat();
        double num4 = keyboard.nextFloat();
        double num5 = keyboard.nextFloat();
        double avg = Exam.getAverage(num1, num2, num3, num4, num5);
        char letter = Exam.determineGrade(avg);

        System.out.printf("Average: %.1f\n", avg);
        System.out.println("Letter grade: " + letter);
    }
}
