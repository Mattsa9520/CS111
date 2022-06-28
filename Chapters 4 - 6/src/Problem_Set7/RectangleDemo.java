package Problem_Set7;

import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class RectangleDemo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double length = Rectangle.getLength(keyboard);
        double width = Rectangle.getWidth(keyboard);
        double area = Rectangle.getArea(length, width);

        System.out.printf("You entered: %.1f, %.1f, and %.1f\n", length, width, area);

        Rectangle.displayData(length, width);
    }
}
