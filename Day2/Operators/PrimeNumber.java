package Day2.Operators;
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Your Number: ");
        int number = sc.nextInt();
        System.out.println(isPrime(number));
    }
    static String isPrime(int n)
    {
        int count = 1;
        if(n == 1 || n == 2)
        {
            return "PrimeNumber";
        }
        for(int i = 2;i <= n/2;i++)
        {
            if(n%i == 0)
            {
                count++;
            }

        }
        if(count > 1)
        {
            return "Not a PrimeNumber";
        }
        else {
            return "PrimeNumber";
        }
    }
}
