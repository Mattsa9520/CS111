package Problem_Set9;

public class ArrayTools
{
    public static int linearSearch(String[] haystack, String needle)
    {
        int result = -1;

        int subscript = 0;
        boolean found = false;
        while (subscript < haystack.length && !found)
        {
            if (haystack[subscript].equals(needle))
            {
                result = subscript;
                found = true;
            }

            subscript++;
        }

        return result;
    }
}
