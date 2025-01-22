package Day17;
import java.util.ArrayList;
import java.util.List;

        public class Main {
            public static void main(String[] args) {
                List<StudentExample> students = new ArrayList<>();
                students.add(new StudentExample("Alice", 85));
                students.add(new StudentExample("Bob", 92));
                students.add(new StudentExample("Charlie", 78));
                students.add(new StudentExample("Diana", 88));
                for (StudentExample student : students) {
                    student.displayStudentDetails();
                }
            }
        }

        class StudentExample {
            private String name;
            private int marks;

            public StudentExample(String name, int marks) {
                this.name = name;
                this.marks = marks;
            }
            public void displayStudentDetails() {
                System.out.println("Name: " + name + ", Marks: " + marks);
            }
        }
