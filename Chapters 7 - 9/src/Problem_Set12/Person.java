package Problem_Set12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Person
{
    private String ssn, firstName, lastName, email, country, ip;

    public Person(String[] tokens)
    {
        ssn = tokens[0];
        firstName = tokens[1];
        lastName = tokens[2];
        email = tokens[3];
        country = tokens[4];
        ip = tokens[5];
    }

    public String toString()
    {
        return firstName + " " + lastName + " lives in " + country;
    }

    public boolean livesIn(String country)
    {
        return this.country.toLowerCase().contains(country);
    }

    public static ArrayList<Person> loadDatabase() throws FileNotFoundException {
        File f = new File("fake-people.csv");
        ArrayList<Person> result = new ArrayList<Person>();
        Scanner inputFile = new Scanner(f);

        inputFile.nextLine(); // skipping header.

        while (inputFile.hasNextLine())
        {
            String line = inputFile.nextLine();

            String[] tokens = line.split(",");
            Person p = new Person(tokens);
            result.add(p);
        }

        return result;
    }
}
