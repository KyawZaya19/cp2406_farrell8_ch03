import java.util.Scanner;
public class Percentages2
{
    public static void main(String[] args)
    {
        double num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a double >> ");
        num1 = input.nextDouble();
        System.out.print("Enter another double >> ");
        num2 = input.nextDouble();
        computePercent(num1, num2);
        computePercent(num2, num1);
    }
    public static void computePercent(double x, double y)
    {
        System.out.println(x + " is " + (x / y) * 100 + " percent of " + y);
    }
}

