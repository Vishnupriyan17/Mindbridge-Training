package Day7.Reflection;

public class Person {
    String name;
    double salary;
    public Person()
    {

    }
    public Person(String name,double salary)
    {
        this.name = name;
        this.salary = salary;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setSalary(double salary)
    {
        System.out.println(salary);
        this.salary = salary;
    }
    public double getSalary()
    {
        return salary;
    }
}
