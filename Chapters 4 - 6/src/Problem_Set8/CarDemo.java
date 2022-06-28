package Problem_Set8;

import java.util.Scanner;

// This is an example problem.
public class CarDemo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter car make");
        String make = keyboard.nextLine();

        System.out.println("Enter car year");
        int year = keyboard.nextInt();

        Car myCar = new Car();
        myCar.setMake(make);
        myCar.setYearModel(year);

        System.out.println("Make: " + myCar.getMake());
        System.out.println("Year: " + myCar.getYearModel());

        int input;
        do {
            System.out.println("[1] Go Faster");
            System.out.println("[2] Go Slower");
            System.out.println("[3] Exit");
            input = keyboard.nextInt();

            if (input == 1)
            {
                myCar.goFaster();
            } else if (input == 2)
            {
                myCar.goSlower();
            }

            System.out.println("Current speed: " + myCar.getSpeed());
        } while (input != 3);
    }
}
