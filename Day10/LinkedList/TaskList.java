package Day10.LinkedList;
import java.util.LinkedList;
import java.util.Scanner;
public class TaskList {
    public static void main(String[] args) {
        LinkedList <String> task = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("Enter your choice: \n"+
                "1. Add a Task\n"+"2. Remove a Task\n"+"3. Display the Task\n"+"4. Exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter a task to add");
                String addTask = sc.next();
                task.add(addTask);
                System.out.println("Your task is successfully added ");
                break;
            case 2:
                System.out.println("Enter a task to remove");
                String removeTask = sc.next();
                task.remove(removeTask);
                System.out.println("Your task is successfully removed ");
                break;
            case 3:
                System.out.println("Your tasks are: ");
                for (String tasks : task) {
                    System.out.println(tasks);
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
