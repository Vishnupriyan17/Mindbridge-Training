package Day10.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Map<String,Double> grade = new HashMap<String,Double>() ;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter your choice: \n"+
                    "1. Add a Name and Grade\n"+"2. Update a Name and Grade\n"+"3. Retrieve the grade\n"+"6. Display the list\n"+"5. Exit");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter a name");
                    String key = sc.next();
                    System.out.println("Enter a grade");
                    double value = sc.nextDouble();
                    grade.put(key,value);
                    System.out.println("Your name and grade is successfully added ");
                    break;
                case 2:
                    System.out.println("Enter a name and grade to update");
                    String updateKey = sc.next();
                    Double updateValue = sc.nextDouble();
                    grade.put(updateKey,updateValue);
                    break;
                case 3:
                    System.out.println("Enter the name: ");
                    String retrieveKey = sc.next();
                    System.out.println(retrieveKey +" : "+grade.get(retrieveKey));
                    break;
                case 4:
                    System.out.println("Your List of students are ");
                    for(Map.Entry<String,Double> stu : grade.entrySet())
                    {
                        System.out.println(stu);
                    }
                    break;
                case 5:
                        System.out.println("Thankyou");
                        return;
                default:
                    System.out.println("Enter a valid choice ");
            }
        }
    }
}
