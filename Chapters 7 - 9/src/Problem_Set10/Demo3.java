package Problem_Set10;

import java.util.Scanner;

public class Demo3
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("How many strings?");
    int size = keyboard.nextInt();
    keyboard.nextLine();

    String[] arr = new String[size];

    for (int subscript = 0; subscript < size; subscript++)
    {
      System.out.println("Enter a value:");
      arr[subscript] = keyboard.nextLine();
    }

    ArrayTools.filter(arr);
    ArrayTools.printAll(arr);

  }
}
