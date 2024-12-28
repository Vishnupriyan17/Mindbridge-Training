package Day2.Program_Control;
import java.util.*;
public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = sc.nextInt();
        printPyramid(number);
    }
    static void printPyramid(int n)
    {
        for(int i =1;i<=n;i++)
        {
            for(int j = 0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k = 0;k<i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
