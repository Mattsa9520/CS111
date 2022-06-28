package Problem_Set4;

import java.util.Scanner;

public class Problem9
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        // Capture user input
        System.out.println("Enter number of software packages to purchase");
        double packages = keyboard.nextInt();
        double discount = 0.0;
        double cost = 0.0;

        // Check category of discount based on number of packages
        if (packages >= 10.0 && packages <= 19.0)
        {
            cost = (99.00 * 0.8) * packages;
            // use discount variable for efficiency instead of a bunch of
            // individual print statements.
            discount = 20.0;
        } else if (packages >= 20.0 && packages <= 49.0)
        {
            cost = (99.00 * 0.7) * packages;
            discount = 30.0;
        } else if (packages >= 50.0 && packages <= 99.0)
        {
            cost = (99.00 * 0.6) * packages;
            discount = 40.0;
        } else if (packages >= 100.0)
        {
            cost = (99.00 * 0.5) * packages;
            discount = 50.0;
        } else {
            cost = packages * 99.00;
        }

        // display output based on number of packages.
        if (packages > 9)
        {
            System.out.printf("Since you purchased %.0f packages, you earned a discount of %.0f%%!\n", packages, discount);
            System.out.printf("Pre-discount total: $%,-2.2f\n", (packages * 99.00));
        }
        System.out.printf("Total cost: $%,-2.2f", cost);
    }
}
