package Problem_Set7;

public class Exam
{
    public static double getAverage(double d1, double d2, double d3, double d4, double d5)
    {
        return (d1 + d2 + d3 + d4 + d5) / 5;
    }

    public static char determineGrade(double avg)
    {
        if (avg >= 90 && avg <= 100)
        {
            return 'A';
        } else if (avg >= 80)
        {
            return 'B';
        } else if (avg >= 70)
        {
            return 'C';
        } else if (avg >= 60)
        {
            return 'D';
        } else
        {
            return 'F';
        }
    }
}
