package Problem_Set8;

import java.util.Random;

// This is an example problem.
public class Dice
{
    private int sides;
    private int value;
    Random rng;

    public Dice(int numSides)
    {
        sides = numSides;
        rng = new Random();
    }

    public void roll()
    {
        value = rng.nextInt(sides) + 1;
    }

    public int getSides()
    {
        return sides;
    }

    public int getValue()
    {
        return value;
    }
}
