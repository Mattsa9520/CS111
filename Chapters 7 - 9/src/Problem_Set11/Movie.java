package Problem_Set11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Movie
{
    private String name;
    private int year;
    private String genre;

    public Movie(String name, int year, String genre)
    {
        this.name = name;
        this.year = year;
        this.genre = genre;
    }

    public String toString()
    {
        return name + " (" + genre + ") " + year;
    }

    public boolean equals(int year, String genre)
    {
        return (this.year == year && this.genre.equals(genre));
    }

    public String getName()
    {
        return name;
    }

    public int getYear()
    {
        return year;
    }

    public static ArrayList<Movie> loadDataBase() throws FileNotFoundException {
        ArrayList<Movie> result = new ArrayList<Movie>();

        File f = new File("db.txt");
        Scanner inputFile = new Scanner(f);

        while (inputFile.hasNext())
        {
            String name = inputFile.nextLine();
            int year = inputFile.nextInt();
            inputFile.nextLine();
            String genre = inputFile.nextLine();

            Movie m = new Movie(name, year, genre);
            //System.out.println(m);

            result.add(m);
        }

        return result;
    }
}
