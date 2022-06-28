package Problem_Set7;

public class Store
{
    public static double calculateRetail(double wholesale, double markup)
    {
        return wholesale + (wholesale * (markup / 100));
    }
}
