import java.util.Scanner;
public class NumbersDemo2
{
    public static void main(String[] args)
    {
        int num1;
        num1 = getNumber();
        int num2;
        num2 = getNumber();
        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquared(num1);
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquared(num2);
    }

    public static int getNumber()
    {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer >> ");
        number = input.nextInt();
        return number;
    }
    public static void displayTwiceTheNumber(int n)
    {
        final int FACTOR = 2;
        System.out.println(n + " times " + FACTOR + " is " + (n * FACTOR));
    }

    public static void displayNumberPlusFive(int n)
    {
        final int FACTOR = 5;
        System.out.println(n + " plus " + FACTOR + " is " + (n + FACTOR));
    }

    public static void displayNumberSquared(int n)
    {
        System.out.println(n + " squared is " + (n * n));
    }
}
