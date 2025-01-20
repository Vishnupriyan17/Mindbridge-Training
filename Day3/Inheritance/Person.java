package Day3.Inheritance;
class Student extends Person{
    int rollNumber = 57;
    double marks = 78.9;
    public void display(String name,int age)
    {
        System.out.println("Name: "+name+"\nAge: "+age+"\nRollNumber: "+rollNumber+"\nMarks: "+marks);
    }
}
public class Person {
    public static void main(String[] args) {
        String name = "Vishnupriyan";
        int age = 88;
        Student stu = new Student();
        stu.display(name,age);
    }
}
