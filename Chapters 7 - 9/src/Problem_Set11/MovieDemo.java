package Problem_Set11;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MovieDemo
{
    // create on keyboard scanner for all functions to share.
    private static Scanner keyboard = new Scanner(System.in);

    // created from example
    public static void printRandomMovie(ArrayList<Movie> database)
    {
        System.out.println("Picking random movie from " + database.size() + " movies");

        Random rng = new Random();
        int subscript = rng.nextInt(database.size());

        System.out.println("Your movie is: " + database.get(subscript));
    }

    // created from example
    public static void printMatchingMovie(int year, String genre, ArrayList<Movie> database)
    {
        int numMatches = 0;
        for (Movie temp : database)
        {
            if (temp.equals(year, genre))
            {
                System.out.println(temp);
                numMatches++;
            }
        }

        System.out.println("Number of matching movies: " + numMatches);
    }

    // Asks user for two characters and displays all movies that start
    // with those two characters. Also displays number of matching movies.
    // ArrayList<Movie> database - the database used to find movies.
    public static void printTwoCharacterMatch(ArrayList<Movie> database)
    {
        // ask user for first two characters, capture input, display input to user.
        System.out.println("Movie search by characters. Enter two characters.");
        String characters = keyboard.nextLine();
        System.out.println("Movies that start with " + characters);

        // iterate through each movie in database, if movie name starts with
        // user's input, display movie name. Increase number of matched movies.
        int numMatches = 0;
        for (Movie m : database)
        {
          if (m.getName().length() >= 2)
          {
              if (m.getName().substring(0, 2).equals(characters))
              {
                  System.out.println(m.getName());
                  numMatches++;
              }
          }
        }

        // display number of matched movies, if there are no matches, display
        // special message.
        if (numMatches > 0)
        {
            System.out.println("Number of matches: " + numMatches);
        } else
        {
            System.out.println("No matching movies found!");
        }
    }

    // Ask user for two years and display all movies released within those years.
    // ArrayList<Movie> database - the database used to find movies.
    public static void printMoviesInRange(ArrayList<Movie> database)
    {
        // ask user for two years, capture input, display user's input.
        System.out.println("Movie search by year range. Enter two years.");
        int year1 = keyboard.nextInt();
        int year2 = keyboard.nextInt();
        System.out.println("Movies with short names that were released between " + year1 + " and " + year2);

        // iterate through all movies in database. if movie was
        // released between user's range and the movie's name
        // has less than 6 characters, print movie name.
        int numMatches = 0;
        for (Movie m : database)
        {
            if (m.getYear() >= year1 && m.getYear() <= year2)
            {
                if (m.getName().length() < 6)
                {
                    System.out.println(m.getName());
                    numMatches++;
                }
            }
        }

        // Display number of matches, if no matches were found, display special message.
        if (numMatches > 0)
        {
            System.out.println("Number of matches: " + numMatches);
        } else {
            System.out.println("No matching movies found!");
        }
    }

    // Asks user for a movie name, prints name of the three movies listed before
    // that which the user entered.
    // ArrayList<Movie> database - the database used to find movies.
    public static void findLastThreeMovies(ArrayList<Movie> database)
    {
        // prompt user for the name of a movie, capture the input.
        System.out.println("Similar title finder. Enter a movie name.");
        String movieName = keyboard.nextLine();
        System.out.println("Here are the 3 movies that are listed before the one you entered");

        // iterate through every movie in the database until the user's movie is found.
        // once found, display the previous three movies and exit the loop.
       for (int i = 0; i < database.size(); i++)
       {
           if (database.get(i).getName().equals(movieName))
           {
               System.out.println(database.get(i - 3).getName());
               System.out.println(database.get(i - 2).getName());
               System.out.println(database.get(i - 1).getName());
               i = database.size();
           }
       }
    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Movie> database = Movie.loadDataBase();

        findLastThreeMovies(database);
    }
}
