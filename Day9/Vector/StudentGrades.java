package Day9.Vector;

import java.util.Collections;
import java.util.Vector;
import java.util.*;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector <Integer> grades = new Vector<Integer>();
        grades.add(98);
        grades.add(68);
        grades.add(87);
        grades.add(50);
        grades.add(77);
        System.out.println("Your grades are: "+grades);
        System.out.println("Maximum Grade is: "+ Collections.max(grades));
        System.out.println("Minimum Grade is: "+ Collections.min(grades));
        int value = 0;
        int count = 0;
        for(int i : grades)
        {
            value = value + i;
            count++;
        }
        System.out.println("Average Grade is: "+ (value/count));
        int end = grades.size()-1;
        System.out.println("Enter your element index that need to remove: "+"0 to "+end);
        int index = sc.nextInt();
        grades.remove(index);
        System.out.println("Your updated grades are: "+grades);
    }
}
