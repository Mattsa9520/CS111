package Problem_Set12;

import java.util.ArrayList;
import java.util.Scanner;

public class DisplayFoodDemo
{
    public static ArrayList<String> format(String ingredients)
    {
        // put string into string builder so it can be modified
        StringBuilder sb = new StringBuilder(ingredients);
        ArrayList<String> ingList = new ArrayList<String>();

        // while there is still content in the list of ingredients separate the ingredients
       do {
           int firstColon = sb.indexOf(":");
           int firstBracket = sb.indexOf(">");

           // if there are no more tokens then the list is at the last ingredient
           if (firstBracket < 0 && firstColon < 0)
           {
               ingList.add(sb.toString().substring(0, sb.length()));
               sb.delete(0, sb.length());
           }

           // remove up to the first colon or bracket in the list, move that ingredient to the arraylist and
           // remove that ingredient from the string builder. Then repeat cycle.
           if (firstColon < firstBracket  && firstColon > 0 || firstBracket < 0 && firstColon > 0)
           {
               ingList.add(sb.toString().substring(0, firstColon).trim());
               sb.delete(0, firstColon + 1);
           } else if (firstBracket < firstColon && firstBracket > 0 || firstColon < 0 && firstBracket > 0){
               ingList.add(sb.toString().substring(0, firstBracket).trim());
               sb.delete(0, firstBracket + 1);
           }

       } while (sb.length() > 0);

       return ingList;
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter ingredients");
        String input = keyboard.nextLine();

        for (String ingredients : format(input))
        {
            // if the ingredient starts with white space, clear all whitespaces, else leave as is
            if (!Character.isWhitespace(ingredients.charAt(0)))
            {
                System.out.println(ingredients);
            } else {
                System.out.println(ingredients.replaceAll(" ", ""));
            }
        }
    }
}
