package Problem_Set8;

import Problem_Set8.FileStats;

import java.io.FileNotFoundException;

public class FileStatsDemo
{
    public static void main(String[] args) throws FileNotFoundException {

        FileStats billOfRights = new FileStats("bill-of-rights.txt");
        FileStats romeoAndJuliet = new FileStats("romeo-and-juliet.txt");
        FileStats dictionary = new FileStats("dictionary.txt");

        System.out.println("Running Program...");

        System.out.println("Num lines in Bill of Rights: " + billOfRights.getNumLines());
        System.out.println("Num lines in Romeo and Juliet: " + romeoAndJuliet.getNumLines());
        System.out.println("Num lines in dictionary: " + dictionary.getNumLines());

        System.out.println("-- Bill of Rights Test --");
        System.out.println("'the' count: " + billOfRights.getNumLinesThatContain("the"));
        System.out.println("'no' count: " + billOfRights.getNumLinesThatContain("no"));
        System.out.println("'rights' count: " + billOfRights.getNumLinesThatContain("rights"));

        System.out.println("-- Romeo and Juliet Test --");
        System.out.println("'Romeo' count: " + romeoAndJuliet.getNumLinesThatContain("ROMEO"));
        System.out.println("'Juliet' count: " + romeoAndJuliet.getNumLinesThatContain("juliet"));
        System.out.println("'emoji' count: " + romeoAndJuliet.getNumLinesThatContain("emoji"));
        System.out.println("'end' count: " + romeoAndJuliet.getNumLinesThatContain("end"));
    }
}
