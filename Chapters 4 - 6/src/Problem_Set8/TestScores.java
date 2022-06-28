package Problem_Set8;

public class TestScores
{
    private String name;
    private double totalScore;
    private int numScores;

    public TestScores(String name)
    {
        this.name = name;
    }

    public void addTestScore(double earned)
    {
        if (earned >= 0)
        {
            totalScore += earned;
            numScores++;
        }
    }

    public int getNumTestsTaken()
    {
        return numScores;
    }

    public double getAverage()
    {
        return totalScore / numScores;
    }
}
