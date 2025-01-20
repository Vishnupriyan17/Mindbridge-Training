package Day3.Static;

public class Counter {
    static int count = 0;
    Counter()
    {
        count++;
    }
    public static void getCount()
    {
        System.out.println(count);
    }
    public static void main(String[] args) {
        Counter counter = new Counter();
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        getCount();
    }
}
