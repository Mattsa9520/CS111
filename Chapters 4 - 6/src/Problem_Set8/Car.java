package Problem_Set8;

// This is an example problem.
public class Car
{
    private int speed;
    private String make;
    private int yearModel;

    public void goFaster()
    {
        speed += 5;
        if (speed > 120)
        {
            speed = 120;
        }
    }

    public void goSlower()
    {
        speed -= 5;
        if (speed < 0)
        {
            speed = 0;
        }
    }

    public int getSpeed()
    {
        return speed;
    }

    public void setMake(String name)
    {
        make = name;
    }

    public void setYearModel(int y)
    {
        yearModel = y;
    }

    public String getMake()
    {
        return make;
    }

    public int getYearModel()
    {
        return yearModel;
    }

}
