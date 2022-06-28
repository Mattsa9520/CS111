package Problem_Set6;

import java.io.*;
import java.util.Scanner;

public class Problem4
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter filename");
        String filename = keyboard.nextLine();
        File file = new File(filename);

        if (!file.exists()) {
            System.out.println("File not found");
            System.exit(0);
        }

        Scanner inputFile = new Scanner(file);

        int counter = 1;
        while (inputFile.hasNextLine())
        {
            String line = inputFile.nextLine();
            System.out.println(counter++ + ": " + line);
        }

        inputFile.close();
    }
}
