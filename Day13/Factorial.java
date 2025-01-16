package Day13;
public class Factorial {
    public static void main(String args[])
    {
        System.out.println(factorial(3));
    }
    static int factorial(int number)
    {
        if(number < 0)
        {
            return 0;
        }
        if(number == 0 || number == 1)
        {
            return 1;
        }
        int factorialValue = 1;
        for(int i =1;i<=number;i++)
        {
            factorialValue = factorialValue*i;
        }
        return factorialValue;
    }
}
