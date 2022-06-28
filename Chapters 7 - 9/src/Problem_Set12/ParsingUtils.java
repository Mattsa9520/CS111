package Problem_Set12;

public class ParsingUtils
{
    public static void changeLetter(StringBuilder sb, char letter)
    {
        // replace character with uppercase version of said character
        sb.replace(0, sb.length(), sb.toString().replace(letter, Character.toUpperCase(letter)));
    }

    public static void changeLetter(StringBuilder sb, String letters)
    {
        // break characters into individual strings
        String[] tokens = letters.split("");

        // iterate over each letter, change said letter in string to be uppercase
        for (String token : tokens)
        {
            sb.replace(0, sb.length(), sb.toString().replace(token.charAt(0), Character.toUpperCase(token.charAt(0))));
        }
    }
}
