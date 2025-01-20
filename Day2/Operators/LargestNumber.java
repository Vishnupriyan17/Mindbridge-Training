package Day2.Operators;
import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your FirstNumber: ");
        int number1 = sc.nextInt();
        System.out.println("Enter your SecondNumber: ");
        int number2 = sc.nextInt();
        System.out.println("Enter your ThirdNumber: ");
        int number3 = sc.nextInt();
        System.out.println(findLargest(number1,number2,number3));
    }
    static int findLargest(int n1,int n2,int n3)
    {
        int largest = 0;
        largest = n1 > n2 ?  //line 1 condition
                            n1 > n3 ? n1 : n3   //line 1 if true
                                : n2 > n3 ? n2 : n3;   //line 1 if false
        return largest;
    }
}
