package Day2.Operators;

import java.util.*;
public class Factorial {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your factorial number: ");
        int number = sc.nextInt();
        System.out.println(factorial(number));
    }
    static int factorial(int number)
    {
        int factorialValue = 1;
        for(int i =1;i<=number;i++)
        {
            factorialValue = factorialValue*i;
        }
        return factorialValue;
    }
}
