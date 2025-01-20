package Day10.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> Names = new HashSet<String>();
        while(true)
        {
            System.out.println("Enter your choice: \n"+
                    "1. Add a Name\n"+"2. Check a Name\n"+"3. Display the Name\n"+"4. Exit");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter a name to add");
                    String addTask = sc.next();
                    Names.add(addTask);
                    System.out.println("Your name is successfully added ");
                    break;
                case 2:
                    System.out.println("Enter a name to check");
                    String checkName = sc.next();
                    if(Names.contains(checkName))
                    {
                        System.out.println("Your name is there");
                    }
                    else {
                        System.out.println(checkName+" is not there you can add it");
                    }
                    break;
                case 3:
                    System.out.println("Your Names are: ");
                    for (String name : Names) {
                        System.out.println(name);
                    }
                    break;
                case 4:
                    System.out.println("Thankyou for your presence ");
                    return;
                default:
                    System.out.println("Enter a valid choice ");
            }
        }
    }
}
