package Problem_Set5;

public class Problem6
{
    public static void main(String[] args)
    {
        int numBottles = 99;
        // Stores plurality
        String bottles = "bottles";

        for (int i = numBottles; i > 0; i--)
        {

            System.out.println(numBottles + " " + bottles + " of Pepsi on the wall, " + numBottles + " " + bottles + " of Pepsi.");
            numBottles--;

            // change plurality when only one bottle left
            if (numBottles == 1)
            {
                bottles = "bottle";
            } else
            {
                bottles = "bottles";
            }

            System.out.println("Take one down, pass it around, " + numBottles + " " + bottles + " of Pepsi on the wall.");
        }
    }
}
