package Problem_Set5;

import java.io.*;
import java.util.Scanner;

public class Example
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fwriter = new FileWriter("test.txt", true);
        PrintWriter outputFile = new PrintWriter(fwriter);

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = keyboard.nextLine();

        outputFile.println(name);
        outputFile.close();

        File file = new File("test.txt");

        if (!file.exists())
        {
            System.out.println("Cannot open file");
            System.exit(0);
        }

        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext())
        {
            String line = inputFile.nextLine();
            System.out.println(line);
        }

        inputFile.close();
    }
}
