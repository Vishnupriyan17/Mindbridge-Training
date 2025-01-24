package Day18;

import java.util.*;
import java.util.stream.Collectors;

public class Student {
    String name;
    List<Integer> marks;
    String grade;
    String department;

    public Student(String name, List<Integer> marks, String department) {
        this.name = name;
        this.marks = marks;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public String getDepartment() {
        return department;
    }

    public String getGrade() {
        return grade;
    }

    public void assignGrade(double average) {
        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else {
            grade = "D";
        }
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("John", Arrays.asList(85, 90, 78, 92, 88), "CS"),
                new Student("Alice", Arrays.asList(95, 92, 98, 90, 91), "Math"),
                new Student("David", Arrays.asList(75, 80, 72, 78, 70), "Physics"),
                new Student("Emily", Arrays.asList(88, 92, 85, 90, 87), "CS"),
                new Student("Michael", Arrays.asList(60, 65, 70, 55, 62), "Math"),
                new Student("Sophia", Arrays.asList(90, 95, 98, 92, 94), "CS"),
                new Student("James", Arrays.asList(70, 75, 68, 72, 70), "Physics"),
                new Student("Chloe", Arrays.asList(55, 60, 58, 62, 50), "Math"),
                new Student("Daniel", Arrays.asList(80, 85, 82, 88, 84), "CS"),
                new Student("Olivia", Arrays.asList(92, 96, 90, 94, 91), "Physics")
        );

        students.forEach(student -> {
            double average = student.getMarks().stream().mapToInt(Integer::intValue).average().orElse(0.0);
            student.assignGrade(average);
        });

        List<Student> top3Students = students.stream()
                .sorted((s1, s2) -> Double.compare(
                        s2.getMarks().stream().mapToInt(Integer::intValue).average().orElse(0.0),
                        s1.getMarks().stream().mapToInt(Integer::intValue).average().orElse(0.0)))
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Top 3 Students:");
        top3Students.forEach(student -> System.out.println(student.getName()));

        Map<String, Double> departmentAverages = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment,
                        Collectors.averagingDouble(student -> student.getMarks().stream().mapToInt(Integer::intValue).average().orElse(0.0))
                ));

        System.out.println("\nDepartment Averages:");
        departmentAverages.forEach((department, avg) -> System.out.println(department + ": " + avg));

        Map<String, Optional<Student>> topStudentByDepartment = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(student -> student.getMarks().stream().mapToInt(Integer::intValue).average().orElse(0.0)))
                ));

        System.out.println("\nTop Student in Each Department:");
        topStudentByDepartment.forEach((department, student) ->
                System.out.println(department + ": " + (student.isPresent() ? student.get().getName() : "None")));

        Map<String, Long> failedStudentsByDepartment = students.stream()
                .filter(student -> student.getMarks().stream().mapToInt(Integer::intValue).average().orElse(0.0) < 50)
                .collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()));

        System.out.println("\nFailed Students by Department:");
        failedStudentsByDepartment.forEach((department, count) -> System.out.println(department + ": " + count));
    }
}
