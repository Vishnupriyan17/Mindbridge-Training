package Day6.Objects;

public class Main {
    String name ;
    int age;
    Main(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Main main = new Main("Vishnu",21);
        System.out.println(main.getClass());
        System.out.println(main.toString());
    }

    @Override
    public String toString() {
        return "Name: "+name + ","+"Age: "+age;
    }
}
