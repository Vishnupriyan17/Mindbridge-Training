package Day3.Interface;
interface Vehicle{
    void start();
}
interface FourWheeler extends Vehicle{
    void fourWheel();
}
interface TwoWheeler extends Vehicle,FourWheeler{
    void twoWheel();
}
public class Main implements TwoWheeler{
    public void start()
    {
        System.out.println("Vehicle interface");
    }
    public void fourWheel()
    {
        System.out.println("FourWheeler interface");
    }
    public void twoWheel()
    {
        System.out.println("TwoWheeler interface");
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.start();
        main.fourWheel();
        main.twoWheel();
    }
}
