package Problem_Set7;

import Problem_Set7.Example1;

import java.util.Scanner;

public class Example1Demo
{
    public static void main(String[] args) throws InterruptedException {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("--- Paper Rock Scissors Version 1 ---");
        String user = Example1.getUserChoice(keyboard);
        String cpu = Example1.getComputerChoice();

        System.out.println("Thinking...");
        Thread.sleep(2000);
        Example1.showWinner(user, cpu);
    }
}
