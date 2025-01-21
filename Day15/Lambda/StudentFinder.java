package Day15.Lambda;
import java.util.List;
import java.util.ArrayList;

public class StudentFinder {
    public static List<String> findStudentsByInitial(List<String> names, char initial) {
        List<String> result = new ArrayList<>();

        names.forEach(name -> {
            if (name.charAt(0) == initial) {
                result.add(name);
            }
        });

        return result;
    }

    public static void main(String[] args) {
        List<String> studentNames = List.of("Alice", "Bob", "Charlie", "Anna", "David");
        char initial = 'A';
        List<String> studentsWithInitial = findStudentsByInitial(studentNames, initial);

        System.out.println("Students whose names start with '" + initial + "': " + studentsWithInitial);
    }
}
