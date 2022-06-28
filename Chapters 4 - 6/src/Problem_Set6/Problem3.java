package Problem_Set6;

import java.util.Scanner;

public class Problem3
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a height");
        int height = keyboard.nextInt();
        int width = 1;

        if (height < 0)
        {
            System.out.println("Height must be at least one.");
            System.exit(0);
        }

       for (int i = 1; i <= height; i++)
       {
           for (int j = 1; j <= width; j++)
           {
               if (j == width)
               {
                   System.out.println("*");
               } else {
                   System.out.print("*");
               }
           }

           width++;
       }
    }
}
