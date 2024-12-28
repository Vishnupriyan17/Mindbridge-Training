package Day2.Program_Control;
import java.sql.SQLOutput;
import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        System.out.println(findLeapYear(year));
    }
    static String findLeapYear(int year)
    {
        if(year % 4 == 0 && year % 400 == 0 || year % 100 != 0)
        {
            return "LeapYear";
        }
        else{
            return "Not a LeapYear";
        }
    }
}
