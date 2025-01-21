package Day15.Lambda;
import java.util.ArrayList;
import java.util.List;
public class StudentName {
        public static List<String> transformStudentNames (List < String > names) {
            List<String> transformedNames = new ArrayList<>();
            names.forEach(name -> transformedNames.add("Student: " + name.toUpperCase()));
            return transformedNames;
        }

        public static void main(String[] args) {
            List<String> studentNames = List.of("Alice", "Bob", "Charlie");
            List<String> transformedNames = transformStudentNames(studentNames);
            System.out.println(transformedNames.toString());
        }
    }