package Problem_Set10;

import java.util.Scanner;


public class LotteryCheck
{
    //Sort array from least to greatest value.
    public static void selectSort(int[] arr)
    {
        for (int startScan = 0; startScan < arr.length - 1; startScan++)
        {
            int minIndex = startScan;
            int minValue = arr[startScan];
            for (int index = startScan + 1; index < arr.length; index++)
            {
                if (arr[index] < minValue)
                {
                    minValue = arr[index];
                    minIndex = index;
                }
            }

            arr[minIndex] = arr[startScan];
            arr[startScan] = minValue;
        }
    }

    //Check if desired value is within given array. Return index of desired
    //value if in array.
    public static int binarySearch(int[] arr, int desiredVal)
    {
        int first = 0;
        int last = arr.length - 1;
        int position = -1;
        boolean found = false;
        while (!found && first <= last)
        {
            int middle = (first + last) / 2;
            if (arr[middle] == desiredVal)
            {
                found = true;
                position = middle;
            } else if (arr[middle] > desiredVal)
            {
                last = middle - 1;
            } else {
                first = middle + 1;
            }
        }

        return position;
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        //lottery numbers.
        int[] lotteryNums = {8, 13, 27, 53, 54};

        //user's lottery numbers.
        int[] userNums = new int[5];

        //caputre user's lottery numbers.
        System.out.println("Check your lottery numbers here!");
        for (int i = 0; i < userNums.length; i++)
        {
            //check that user input is within range of 1-99
            do
            {
                System.out.println("Enter number " + (i + 1) + ":");
                userNums[i] = keyboard.nextInt();

                if (userNums[i] < 1 || userNums[i] > 99)
                {
                    System.out.println("Must be between 1 and 99");
                }
            } while (userNums[i] < 1 || userNums[i] > 99);
        }

        //sort lottery numbers in order to check for win.
        selectSort(userNums);

        //find number of matching numbers between user's lottery numbers and
        //winning numbers.
        int matchingNums = 0;
        for (int i = 0; i < lotteryNums.length; i++)
        {
            if (binarySearch(userNums, lotteryNums[i]) != -1)
            {
                matchingNums++;
            }
        }

        System.out.println("All set. The winning numbers were: 8 13 27 53 54");
        //if all user's lottery numbers match winning numbers, user won.
        if (matchingNums == lotteryNums.length)
        {
            System.out.println("WOW! Grand prize winner!");
        } else {
            System.out.println("Well, you didn't win. You got " + matchingNums + " matching number(s)");
        }
    }
}
