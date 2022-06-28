package Problem_Set12;

import java.util.ArrayList;

public class Password
{
    private String pass;
    private ArrayList<String> errorList;

    public Password(String pass)
    {
        this.pass = pass;
        errorList = new ArrayList<String>();
    }

    public boolean isValid()
    {
        int numLowercase = 0;
        int numUppercase = 0;
        int numDigit = 0;

        for (int i = 0; i < pass.length(); i++)
        {
            char current = pass.charAt(i);

            if (Character.isUpperCase(current))
            {
                numUppercase++;
            } else if (Character.isLowerCase(current))
            {
                numLowercase++;
            } else if (Character.isDigit(current))
            {
                numDigit++;
            }
        }

        errorList.clear();
        if (numUppercase < 3)
        {
            errorList.add("At least 3 uppercase letters are required");
        }
        if (numLowercase < 3)
        {
            errorList.add("At least 3 lowercase letters are required");
        }
        if (numDigit < 1)
        {
            errorList.add("At least 1 digit is required");
        }

        return (numUppercase >= 3 && numLowercase >= 3 && numDigit >= 0);
    }

    public String toString()
    {
        String result = "";

        for (String current : errorList)
        {
            result += "[" + current + "]\n";
        }

        return result;
    }
}
