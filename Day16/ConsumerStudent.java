package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerStudent {
    ConsumerStudent()
    {
        List<Student> consStu = new ArrayList<>();
        Student stu1 = new Student("John",70);
        Student stu2 = new Student("Alice",60);
        consStu.add(stu1);
        consStu.add(stu2);
        Consumer<Student> conInc = mark -> mark.setMark(mark.getMark()+10);
        consStu.forEach(conInc);
        consStu.forEach(System.out::println);
    }
    public static void main(String[] args) {
        ConsumerStudent cons = new ConsumerStudent();
    }
}
