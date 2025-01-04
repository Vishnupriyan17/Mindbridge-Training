package Day6.Exception;
import java.io.IOException;
import java.util.*;
public class Main {
    static int number1;
    static int number2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter your first number: ");
            number1 = sc.nextInt();
            System.out.println("Enter your second number: ");
            number2 = sc.nextInt();
        }
        catch (Exception e)
        {
            System.out.println(e+"\nError: Please enter valid integers.");
        }
        try
        {
            number2 = number1/number2;
        }
        catch (Exception e)
        {
            System.out.println(e+"\nError: Division by zero is not allowed.");
        }
        System.out.println("The result of division is: "+number2);
    }
}
