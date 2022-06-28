package Problem_Set8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileStats
{
    private String filename;

    public FileStats(String filename)
    {
        this.filename = filename;
    }

    // Get number of lines that contain given key
    public int getNumLinesThatContain(String key) throws FileNotFoundException {
        // Open file and scanner.
        File fileObj = new File(filename);
        Scanner inputFile = new Scanner(fileObj);
        int numLines = 0;

        // Set key to lowercase to ignore case.
        key = key.toLowerCase();

        // loop through file.
        while (inputFile.hasNext())
        {
            // Collect line, set to lowercase to ignore case.
            // Check if line contains key, increase counter.
            String line = inputFile.nextLine();
            line = line.toLowerCase();
            if (line.contains(key))
            {
                numLines++;
            }
        }

        // Close file to avoid error.
        inputFile.close();
        return numLines;
    }

    public int getNumLines() throws FileNotFoundException {
        // Open file and scanner.
        File fileObj = new File(filename);
        Scanner inputFile = new Scanner(fileObj);
        int numLines = 0;

        // Loop over file, collect line to not get error, increase counter.
        while (inputFile.hasNext())
        {
            String line = inputFile.nextLine();
            numLines++;
        }

        // Close file to avoid error.
        inputFile.close();
        return numLines;
    }
}
