package Problem_Set5;

public class Problem3
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 1000; i++)
        {
            if (i % 5 == 0)
            {
                System.out.println(-i);
            } else
            {
                System.out.println(i);
            }
        }
    }
}
