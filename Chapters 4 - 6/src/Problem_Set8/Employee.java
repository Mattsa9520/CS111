package Problem_Set8;
public class Employee
{
    private String name;
    private int idNumber;
    private String department;
    private String position;

    public Employee()
    {
        name = "(not set)";
        idNumber = 0;
        department = "(not set)";
        position = "(not set)";
    }

    public Employee(String name, int idNumber)
    {
        this.name = name;
        this.idNumber = idNumber;
        department = "(not set)";
        position = "(not set)";
    }

    public Employee(String name, int idNumber, String department, String position)
    {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    public String getName()
    {
        return name;
    }

    public String getDepartment()
    {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public int getIdNumber()
    {
        return idNumber;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setIdNumber(int id)
    {
        idNumber = id;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }
}
