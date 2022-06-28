package Problem_Set7;

import Problem_Set7.Store;

import java.util.Scanner;

public class StoreDemo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter wholesale price and markup percentage");
        double price = keyboard.nextDouble(), markup = keyboard.nextDouble();
        System.out.printf("Retail price: $%.2f", Store.calculateRetail(price, markup));
    }
}
