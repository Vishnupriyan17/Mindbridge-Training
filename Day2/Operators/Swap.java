package Day2.Operators;
import java.util.*;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your FirstNumber: ");
        int number1 = sc.nextInt();
        System.out.println("Enter your SecondNumber: ");
        int number2 = sc.nextInt();
        Swap(number1,number2);
    }
    static void Swap(int n1,int n2)
    {
        n1 = n1^n2;
        n2 = n2^n1;
        n1 = n1^n2;
        System.out.println("The Swapped number is: "+n1+" "+n2);
    }
}
