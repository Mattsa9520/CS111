package Problem_Set12;

public class DomainParser
{
    public static String getTopLevelDomain(String url)
    {
        // return part of string after last period
        return url.substring(url.lastIndexOf('.') + 1);
    }
}
