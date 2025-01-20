package Day2.OOP_Basics;
import java.util.*;
public class BankAccount {
    private String accountNumber;
    private double balance;
    double totalAmount;
    public void deposit(double depositAmount,String accountNumber)
    {
        System.out.println("Your Deposit Amount "+depositAmount+" is successfully deposited to your AccountNumber "+accountNumber);
        totalAmount = totalAmount+depositAmount;
        checkBalance(totalAmount);
    }
    public void withdraw(double withdrawAmount,String accountNumber)
    {
        System.out.println("Your withdrawl amount "+withdrawAmount+"is successfully withdrawed from your Account Number "+accountNumber);
        totalAmount = totalAmount-withdrawAmount;
    }
    public void checkBalance(double totalAmount)
    {
        System.out.println("Your Balance Amount in your Account is: "+totalAmount);
    }
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your AccountNumber");
        bank.accountNumber = sc.nextLine();
            System.out.println("Choose Your Choice: " + "\n" + "1.Deposit" + "\n" + "2.Withdraw" + "\n" + "3.CheckBalance");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter your Deposit Amount");
                    double depositAmount = sc.nextDouble();
                    bank.deposit(depositAmount, bank.accountNumber);
                    break;
                case 2:
                    System.out.println("Enter your Withdrawl Amount");
                    double withdrawAmount = sc.nextDouble();
                    bank.withdraw(withdrawAmount, bank.accountNumber);
                    break;
                default:
                    System.out.println("Enter a valid choice");
            }
    }
}
