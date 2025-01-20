package Day10.Queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
public class CustomerSupport {
    public static void main(String[] args) {
        Queue<String> customers = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("\nCurrent Serve: " + customers.peek());
            System.out.println("Choose an action:");
            System.out.println("1. Add Customers");
            System.out.println("2. Access by Serve ");
            System.out.println("3. Display waiting Customer");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter the customer name: ");
                    String name = sc.next();
                    customers.add(name);
                    System.out.println("Your customer name has added successfully");
                    break;
                case 2:
                    if(!customers.isEmpty()) {
                        String servedCustomer = customers.poll();
                        System.out.println(servedCustomer + " has been served.");
                    }
                    else{
                        System.out.println("No customers in the queue.");
                    }
                    break;
                case 3:
                    if (!customers.isEmpty()) {
                        System.out.println("Waiting customers: " + customers);
                    } else {
                        System.out.println("No customers are waiting.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting Customer Support System. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
