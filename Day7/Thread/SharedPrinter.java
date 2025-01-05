package Day7.Thread;

import java.lang.reflect.Method;

class Thread1 extends Thread{
    Object lock1 = new Object();
    SharedPrinter sharedPrinter;
    Thread1(SharedPrinter sharedPrinter)
    {
        this.sharedPrinter= sharedPrinter;
    }
    @Override
    public void run() {
        sharedPrinter.Method1();
    }
}
class Thread2 extends Thread{
    SharedPrinter sharedPrinter;
    Thread2(SharedPrinter sharedPrinter)
    {
        this.sharedPrinter= sharedPrinter;
    }
    @Override
    public void run() {
        sharedPrinter.Method2();
    }
}
public class SharedPrinter {
    public synchronized void Method1()
    {
        String name="Vishnu";
        for(int i =0;i<10;i++)
        {
            try
            {
                System.out.println(name);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    public synchronized void Method2()
    {
        int count =0;
        for(int i =0;i<10;i++)
        {
            try
            {
                System.out.println(count++);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SharedPrinter sharedPrinter = new SharedPrinter();
        Thread1 thread1 = new Thread1(sharedPrinter);
        Thread2 thread2 = new Thread2(sharedPrinter);
        thread1.start();
        thread2.start();
    }
}
