package Day3.Interface;
class AllInOne implements Printer,Scanner{
    public void print() {
        System.out.println("Printer");
    }
    public void scan() {
        System.out.println("Scanner");
    }

    public static void main(String[] args) {
        AllInOne obj = new AllInOne();
        obj.print();
        obj.scan();
    }
}
interface Scanner{
    void scan();
}
public interface Printer {
    void print();
}
