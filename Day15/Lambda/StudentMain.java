package Day15.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {

    public StudentMain() {
        List<Student> stu = new ArrayList<>();
        Student stu1 = new Student(1, "Vishnu", 8.32,"IT");
        Student stu2 = new Student(2, "Priyan", 8.01,"CSE");
        Student stu3 = new Student(3, "Shan", 7.67,"CSE");
        Student stu4 = new Student(4, "Pavi", 9.90,"IT");
        Student stu5 = new Student(5, "Gogul", 6.32,"EEE");
        Student stu6 = new Student(6, "Praveen", 7.32,"IT");
        stu.add(stu1);
        stu.add(stu2);
        stu.add(stu3);
        stu.add(stu4);
        stu.add(stu5);
        stu.add(stu6);

        System.out.println(stu);

        Collections.sort(stu,(student1,student2) -> Double.compare(student2.getCgpa(),student1.getCgpa()));
        System.out.println(stu);
    }

    public static void main(String[] args) {
        StudentMain student = new StudentMain();
    }

}
