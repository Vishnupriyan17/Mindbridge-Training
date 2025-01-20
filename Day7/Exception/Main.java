package Day7.Exception;
import java.util.*;
class CustomException extends Exception{
    String msg;
    public CustomException(String msg) {
        super(msg);
    }
}
public class Main {
    static int number1;
    static int number2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter your first number: ");
            number1 = sc.nextInt();
            System.out.println("Enter your second number: ");
            number2 = sc.nextInt();
        }
        catch (InputMismatchException e)
        {
            System.out.println("Invalid input. Please enter numeric values.");
            return;
        }
        Main main = new Main();
        try
        {
            main.calculate();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero is not allowed.");
        }
        catch (CustomException e)
        {
            System.out.println(e);
        }
    }
    public void calculate() throws CustomException
    {
        try
        {
            if(number2 == 0)
            {
                throw new ArithmeticException();
            }
            number2 = number1/number2;
            System.out.println("Your division value is: "+number2);
        }
        catch (ArithmeticException e)
        {
            throw new ArithmeticException();
        }
        catch (Exception e)
        {
            throw new CustomException("wertyui");
        }
    }
}
