package Day5.AccessModifier.Details;
class Employee extends Person{
    Employee(String name, int age, String address, double salary)
    {
        super(name, age, address, salary);
    }
    public void display()
    {
        System.out.println("Name is accessible: "+name+
                "\n Age ia accessible: "+age+"\n Address is accessible: "+address+"\n Salary is not accessible: ");
    }
}
public class Person {
    public String name;
    protected int age;
    String address;
    private double salary;

    public Person(String name, int age, String address, double salary)
    {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Vishnu",21,"6,New street",12345.56);
        employee.display();
    }
}
