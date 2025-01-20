package Day2.Operators;
import java.sql.SQLOutput;
import java.util.*;
public class Binary_Representation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int number = sc.nextInt();
        System.out.println(countOnes(number));
    }
    static int countOnes(int n)
    {
        int count = 0;
        while(n != 0)
        {
            if((n&1) == 1)
            {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
