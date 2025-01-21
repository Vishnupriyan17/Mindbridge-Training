package Day16;

import Day15.Lambda.StudentName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StudentNames {
    StudentNames()
    {
        List<Student> name = new ArrayList<Student>();
        Student stu1 = new Student("John",75);
        Student stu2 = new Student("Alice",55);
        Student stu3 = new Student("Mark",88);
        name.add(stu1);
        name.add(stu2);
        name.add(stu3);
        printName(name,names -> names.getMark() > 60 );
    }
    public void printName(List<Student> name, Predicate<Student> condition)
    {
        for(Student names : name)
        {
            if(condition.test(names))
            {
                System.out.println(names.getName());
            }
        }
    }
    public static void main(String[] args) {
        StudentNames stu = new StudentNames();
    }
}
