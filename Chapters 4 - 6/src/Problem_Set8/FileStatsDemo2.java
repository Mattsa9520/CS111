package Problem_Set8;

import Problem_Set8.FileStats;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileStatsDemo2
{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a filename");
        String filename = keyboard.nextLine();

        FileStats userFile = new FileStats(filename);

        System.out.println(filename + " has " + userFile.getNumLines() + " lines");

        System.out.println("Enter some text");
        String userText = keyboard.nextLine();
        System.out.println(userFile.getNumLinesThatContain(userText) + " line(s) contain \"" + userText + "\"");
    }
}
