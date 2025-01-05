package Day7.Thread;

class Number extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread " + i );
                Thread.sleep(500);
            }
        }catch (InterruptedException e)
        {

        }
    }
}
class Square extends Thread{
    @Override
    public void run() {

       try {
           for (int i = 0; i < 10; i++) {
               System.out.println("Square of " + i + " " + (i * i));
               Thread.sleep(700);
           }
       }catch (InterruptedException e)
       {

       }
    }
}
public class Main {
    public static void main(String[] args) {
        Number number = new Number();
        number.start();
        Square square =new Square();
        square.start();
    }
}
