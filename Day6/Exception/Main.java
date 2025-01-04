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
//            System.out.println("Enter your first number: ");
//            number1 = sc.nextInt();
//            System.out.println("Enter your second number: ");
//            number2 = sc.nextInt();
//            number2 = number1/number2;
            throw new IOException("wertgyh");
        } catch (NullPointerException e)
        {
            System.out.println("\nError: Please enter valid integers.");
        }
        catch (ArithmeticException e)
        {
            System.out.println(e+"\nError: Division by zero is not allowed.");
        }
        catch (Exception e){
        }
        System.out.println("The result of division is: "+number2);
    }
}
