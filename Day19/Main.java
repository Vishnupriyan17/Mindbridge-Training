package Day19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ExecutorService excutor = Executors.newFixedThreadPool(5);
        for(int i =1;i<=10;i++)
        {
            int taskNumber = i;
            excutor.submit(() ->{String threadName = Thread.currentThread().getName();
            System.out.println(taskNumber+" "+threadName);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Task intrupted");
            }
        });

        }
        excutor.shutdown();
    }
}
