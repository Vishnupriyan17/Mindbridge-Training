package Day10.Stack;
import java.util.Stack;
import java.util.Scanner;
public class Undo {
    public static void main(String[] args) {
        Stack<String> actionStack = new Stack<>();
        StringBuilder text = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("\nCurrent Text: " + text);
            System.out.println("Choose an action:");
            System.out.println("1. Type text");
            System.out.println("2. Undo last action");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter text to type: ");
                    String input = scanner.nextLine();
                    actionStack.push(input);
                    text.append(input);
                    break;

                case 2:
                    if (!actionStack.isEmpty()) {
                        String lastAction = actionStack.pop();
                        text.setLength(text.length() - lastAction.length());
                        System.out.println("Last action undone.");
                    } else {
                        System.out.println("No actions to undo.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting text editor. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
