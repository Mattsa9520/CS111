package Problem_Set8;

import java.util.Scanner;

public class EmployeeDemo2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        // Create employees.
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        // User input variables
        String name;
        int id;
        String department;
        String position;

        // Get three employees.
        for (int i = 0; i < 3; i++)
        {
            System.out.println("-- Employee Entry Form --");
            System.out.println("Enter name");
            name = keyboard.nextLine();

            System.out.println("Enter ID");
            id = keyboard.nextInt();

            // Clear newline in buffer.
            keyboard.nextLine();

            System.out.println("Enter department");
            department = keyboard.nextLine();

            System.out.println("Enter position");
            position = keyboard.nextLine();

            // Set employee information.
            if (i == 0)
            {
                e1.setName(name);
                e1.setIdNumber(id);
                e1.setDepartment(department);
                e1.setPosition(position);
            } else if (i == 1)
            {
                e2.setName(name);
                e2.setIdNumber(id);
                e2.setDepartment(department);
                e2.setPosition(position);
            } else if (i == 2)
            {
                e3.setName(name);
                e3.setIdNumber(id);
                e3.setDepartment(department);
                e3.setPosition(position);
            }
        }

        // Print out employee table.
        System.out.printf("%12s%13s%13s%13s\n", "Name", "ID", "Department", "Position");
        System.out.printf("%12s%13s%13s%13s\n", e1.getName(), e1.getIdNumber(), e1.getDepartment(), e1.getPosition());
        System.out.printf("%12s%13s%13s%13s\n", e2.getName(), e2.getIdNumber(), e2.getDepartment(), e2.getPosition());
        System.out.printf("%12s%13s%13s%13s\n", e3.getName(), e3.getIdNumber(), e3.getDepartment(), e3.getPosition());
    }
}
