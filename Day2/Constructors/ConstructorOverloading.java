package Day2.Constructors;
class Account{
    String accountNumber;
    double balance;
    Account()
    {
        accountNumber = "KVB123GOBI";
        balance = 12000.987;
    }
    Account(String accountNumber,double balance)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void display()
    {
        System.out.println("Your AccountNumber is: "+accountNumber+"\n"+"Your account balance is: "+balance);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Account obj = new Account();
        obj.display();
        Account obj1 = new Account("BOB123GOBI",12345.678);
        obj1.display();
    }
}
