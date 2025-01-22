package Day17;

import java.util.function.Supplier;

public class ConstructorExample {
    public static void main(String[] args) {
        StudentFactory stu = Student::new;
        stu.create("vishnu",98);

    }
}
