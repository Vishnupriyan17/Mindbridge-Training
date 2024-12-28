package Day2.Additional;
import java.util.*;
class Account{
    private String name;
    private long accountNumber;
    private static double balance;
    static double currentBalance;
    private static List<Account> details;

    Account(String name,long accountNumber)
    {
        this.name = name;
        this.accountNumber = accountNumber;
        balance = 0.0;
        currentBalance = 0.0;
        details = new ArrayList<>();
    }
    public void checkAccount(Account account)
    {
        System.out.println("your account number is: "+accountNumber+"\n"+"your account balance is: "+currentBalance);
    }
    public void createDetails(Account account)
    {
        details.add(account);
        System.out.println("Your account has been created successfully");
    }
    public static void deposit(double depositAmount)
    {
        if(depositAmount > 0)
        {
            currentBalance= currentBalance+depositAmount;
            System.out.println("you deposit a amount successfully and your current balance is: "+currentBalance);
        }
        else{
            System.out.println("Enter a valid depositAmount");
        }
    }
    public static void withdraw(double withdrawAmount)
    {
        if(withdrawAmount > 0)
        {
            currentBalance= currentBalance-withdrawAmount;
            System.out.println("you withdraw a amount successfully and your current balance is: "+currentBalance);
        }
        else{
            System.out.println("Enter a valid withdrawAmount");
        }
    }
    public static void checkBalance()
    {
        System.out.println("Your current balance is: "+currentBalance);
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        String name = "";
        long accountNumber = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Did you have a account or not? (Yes or No)");
        String info = sc.nextLine();
        info = info.toLowerCase();
        if(info.equals("yes")) {
            System.out.println("Enter the account holder name: ");
            name = sc.nextLine();
            System.out.println("Enter the account number: ");
            accountNumber = sc.nextLong();
            Account account1 = new Account(name,accountNumber);
            account1.checkAccount(account1);
        }
        else {
            System.out.println("Enter your name");
            name = sc.nextLine();
            System.out.println("Create your Account number");
            accountNumber = sc.nextLong();
            Account account2 = new Account(name,accountNumber);
            account2.createDetails(account2);
        }
        while (true) {
            System.out.println("Enter your choice \n" +
                    "1.Deposit Amount\n" +
                    "2.Withdraw Amount\n" +
                    "3.Check Balance\n" +
                    "4.Exit\n");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter your deposit amount");
                    double depositAmount = sc.nextDouble();
                    Account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter your withdraw amount");
                    double withdrawAmount = sc.nextDouble();
                    Account.withdraw(withdrawAmount);
                    break;
                case 3:
                    Account.checkBalance();
                    break;
                case 4:
                    return;
            }
        }
    }
}
