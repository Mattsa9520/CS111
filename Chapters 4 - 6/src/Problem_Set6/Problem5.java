package Problem_Set6;

import java.io.*;
import java.util.Scanner;

public class Problem5
{
    public static void main(String[] args) throws IOException
    {
        do {
            Scanner keyboard = new Scanner(System.in);

            System.out.println("Enter word to spellcheck (or exit to end)");
            String input = keyboard.nextLine();
            // keep track of whether or not word is spelled correctly.
            boolean correct = false;

            // Check if user wants to exit program. Ignore case.
            if (input.equalsIgnoreCase("exit"))
            {
                System.out.println("Ending program...");
                System.exit(0);
            }

            // Open dictionary file.
            File dictionary = new File("dictionary.txt");
            Scanner inputFile = new Scanner(dictionary);

            // Go through each line unless the word is spelled correctly.
            while (inputFile.hasNext() && !correct)
            {
                String line = inputFile.nextLine();
                if (line.equals(input))
                {
                    correct = true;
                } else {
                    correct = false;
                }
            }

            // close file.
            inputFile.close();

            // tell use if word is spelled correctly.
            if (correct)
            {
                System.out.println(input + " is spelled correctly.");
            } else {
                System.out.println(input + " is not spelled correctly.");
            }
        } while (true);
        // always run unless the user says to exit.
    }
}
