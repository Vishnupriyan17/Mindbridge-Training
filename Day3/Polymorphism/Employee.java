package Day3.Polymorphism;
class Developer extends Employee{
    int year ;
    double salary;
    Developer(int year,double salary)
    {
        this.year = year;
        this.salary = salary;
    }
    public double calculateSalary()
    {
        return year*salary;
    }
}
class Manager extends Employee{
    int year ;
    double salary;
    Manager(int year,double salary)
    {
        this.year = year;
        this.salary = salary;
    }
    public double calculateSalary()
    {
        return year*salary;
    }
}
public class Employee {
    public double calculateSalary(){
        return 0;
    }
    public static void main(String[] args) {
        Employee employee = new Manager(2,12000);
        System.out.println("The Manager salary is: "+employee.calculateSalary());

        Employee employee1 = new Developer(3,10000);
        System.out.println("The Developer's salary is: "+employee1.calculateSalary());
    }
}
