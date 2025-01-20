package Day2.Constructors;

class Student{
    String name;
    int age;
    Student(String Name,int Age)
    {
        name = Name;
        age = Age;
    }
    public void display()
    {
        System.out.println(name+"\n"+age);
    }
}
public class Parameterized {
    public static void main(String[] args) {
        Student object = new Student("Vishnupriyan",33);
        object.display();
    }
}
