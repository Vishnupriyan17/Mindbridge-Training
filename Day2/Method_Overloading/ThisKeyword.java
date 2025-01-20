package Day2.Method_Overloading;
import java.util.*;
class Employee{
    String employeeId;
    String employeeName;
    double employeeSalary;
    Employee(String employeeId,String employeeName,double employeeSalary)
    {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }
    public void display()
    {
        System.out.println("The EmployeeId  "+employeeId);
        System.out.println("The EmployeeName is: "+employeeName);
        System.out.println("The EmployeeSalary is: "+employeeSalary);
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee id: ");
        String employeeId = sc.nextLine();
        System.out.println("Enter the employee name: ");
        String employeeName = sc.nextLine();
        System.out.println("Enter the employee salary: ");
        double employeeSalary = sc.nextDouble();
        Employee employee = new Employee(employeeId,employeeName,employeeSalary);
        employee.display();
    }
}
