package Problem_Set8;

import java.util.Scanner;

public class TestScoresDemo2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter name");
        String name = keyboard.nextLine();
        TestScores userTests = new TestScores(name);

        int counter = 1;
        double score;
        do {
            System.out.println("Enter score " + counter + " or a negative number to exit");
            score = keyboard.nextDouble();
            userTests.addTestScore(score);
            counter++;
        } while (score >= 0);

        System.out.println("-- " + name + " --");
        System.out.println("Num tests taken: " + userTests.getNumTestsTaken());
        System.out.printf("Average: %.1f\n", userTests.getAverage());
    }
}
