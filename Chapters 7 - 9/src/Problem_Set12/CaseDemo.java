package Problem_Set12;

import java.util.Scanner;

public class CaseDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a String");
        StringBuilder sb = new StringBuilder(keyboard.nextLine());
        System.out.println("Which character should be converted to uppercase?");
        char c = keyboard.nextLine().charAt(0);

        ParsingUtils.changeLetter(sb, c);

        System.out.println(sb);
    }
}
