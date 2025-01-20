package Day13;

import java.util.Scanner;

public class PrimeNumber {
        public static void main(String[] args)
        {
            System.out.println(isPrime(2));
            System.out.println(isPrime(1));
            System.out.println(isPrime(0));
            System.out.println(isPrime(6));
            System.out.println(isPrime(13));
        }
        static String isPrime(int n)
        {
            int count = 1;
            if(n == 0 || n== 1 || n < 0)
            {
                return "Not a PrimeNumber";
            }
            if(n == 2)
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
