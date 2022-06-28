package Problem_Set10;

import java.util.Scanner;

public class Demo2
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

    String[] destination = new String[size];
    System.out.println("copy/print test 1");
    ArrayTools.copy(arr, destination);
    ArrayTools.printAll(destination);

    destination = new String[size + 1];
    System.out.println("copy/print test 1");
    ArrayTools.copy(arr, destination);
    ArrayTools.printAll(destination);

    destination = new String[size - 1];
    System.out.println("copy/print test 1");
    ArrayTools.copy(arr, destination);
    ArrayTools.printAll(destination);

    destination = new String[5];
    System.out.println("copy/print test 1");
    ArrayTools.copy(arr, destination);
    ArrayTools.printAll(destination);

    destination = new String[size * size];
    System.out.println("copy/print test 1");
    ArrayTools.copy(arr, destination);
    ArrayTools.printAll(destination);
  }
}
