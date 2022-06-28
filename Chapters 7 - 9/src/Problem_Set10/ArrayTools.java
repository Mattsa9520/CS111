package Problem_Set10;

public class ArrayTools
{
    //Print entire array. Return size of array.
    public static int printAll(String[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i].length() > 5)
            {
                System.out.println("[" + i + "]: " + arr[i] + " <-- Longer than five letters");
            } else {
                System.out.println("[" + i + "]: " + arr[i]);
            }
        }

        return arr.length;
    }

    //Copy first array into second array. If second array isn't big
    //enough, print out error.
    public static void copy(String[] arr1, String... arr2)
    {
        if (arr2.length < arr1.length)
        {
            System.out.println("Error: Second array isn't big enough.");
            System.out.println("First array size: " + arr1.length);
            System.out.println("Second array size: " + arr2.length);
        } else {
            for (int i = 0; i < arr1.length; i++)
            {
                arr2[i] = arr1[i];
            }
        }
    }

    //Convert all strings with more than 5 letters to uppercase
    public static void filter(String[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i].length() > 5)
            {
                arr[i] = arr[i].toUpperCase();
            }
        }
    }
}
