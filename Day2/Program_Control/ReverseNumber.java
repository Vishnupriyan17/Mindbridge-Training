package Day2.Program_Control;
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = sc.nextInt();
        System.out.println(findReverse(number));
    }
    static int findReverse(int n)
    {
        int reversed = 0;
        while(n != 0)
        {
            int rem = n%10;
            reversed = reversed*10+rem;
            n = n/10;
        }
        return reversed;
    }
}
