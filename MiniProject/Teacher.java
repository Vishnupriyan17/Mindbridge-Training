package MiniProject;

import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Teacher {

    static Scanner sc=new Scanner(System.in);
    private static final String FILE_NAME = "students.csv";
    ExecutorService executor = Executors.newFixedThreadPool(5);
    static File file;
    public Teacher()
    {
        file = new File(FILE_NAME);

    }

    static Map<Integer,Student> studentList = new HashMap<Integer,Student>();


    static int studentId;
    static String studentName;
    static int studentAge;
    static String email;
    static int noSubject;
    static double totalMark;
    static char grade;
    static double mark;


    //create a student
    public void createStudent() {
            try {
                System.out.println("\nEnter a StudentId: ");
                studentId = sc.nextInt();
                sc.nextLine();

                System.out.println("\nEnter a StudentName: ");
                studentName = sc.nextLine();

                System.out.println("\nEnter a StudentAge: ");
                studentAge = sc.nextInt();
                sc.nextLine();

                System.out.println("\nEnter a StudentMailId: ");
                email = sc.nextLine();

                while (!regexCheck(email)) {
                    System.out.println("\nEnter a Valid StudentMailId: ");
                    email = sc.nextLine();
                }

                System.out.println("\nNow enter the No.Of Subjects and its mark to calculate grade");
                noSubject = sc.nextInt();
                sc.nextLine();
                totalMark = 0;

                for (int i = 1; i <= noSubject; i++) {
                    System.out.println("\nEnter the " + i + " Subject mark");
                    mark = sc.nextDouble();
                    totalMark += mark;
                }
            } catch (InputMismatchException e) {
                System.out.println(e);
            }

            double averageMark = totalMark / noSubject;
            if (averageMark >= 90 && averageMark <= 100) {
                grade = 'O';
            } else if (averageMark >= 80 && averageMark <= 89) {
                grade = 'A';
            } else if (averageMark >= 70 && averageMark <= 79) {
                grade = 'B';
            } else if (averageMark >= 60 && averageMark <= 69) {
                grade = 'C';
            } else if (averageMark > 50 && averageMark <= 59) {
                grade = 'D';
            } else if (averageMark <= 49) {
                grade = 'E';
            }


            Student student = new Student(studentId, studentName, studentAge, email, grade);
            studentList.put(studentId, student);
            System.out.println(student);
    }
    //update the student
    public void updateStudent() {
            int choice = 0;
            try {
                System.out.println("\nEnter the StudentId to edit student details: ");
                studentId = sc.nextInt();
                sc.nextLine();

                Student existingStudent = studentList.get(studentId);
                if (existingStudent == null) {
                    System.out.println("\nStudent not found!");
                    return;
                }


                System.out.println("\nEnter which data you want to edit for a student: " +
                        "\n1.Name of a student" +
                        "\n2.Age of a student" +
                        "\n3.EmailId of a student" +
                        "\n4.Marks of a student" +
                        "--------------------------------------------------------");
                System.out.println("\nEnter your choice: ");

                try {
                    choice = sc.nextInt();
                    sc.nextLine();
                } catch (Exception e) {
                    System.out.println("\nInvalid input! Please enter a number.");
                    sc.nextLine();
                }

                switch (choice) {
                    case 1:
                        System.out.println("\nEnter a student name");
                        String newName = sc.nextLine();
                        existingStudent.setStudentName(newName);
                        System.out.println("----------------------student name has successfully updated---------------------------------");
                        break;
                    case 2:
                        System.out.println("\nEnter a student age");
                        int newAge = sc.nextInt();
                        sc.nextLine();
                        existingStudent.setStudentAge(newAge);
                        System.out.println("----------------------student age has successfully updated---------------------------------");
                        break;
                    case 3:
                        System.out.println("\nEnter a student Email-Id");
                        String newEmail = sc.next();


                        while (!regexCheck(newEmail)) {
                            System.out.println("\nEnter a Valid StudentMailId: ");
                            newEmail = sc.nextLine();
                        }


                        existingStudent.setEmail(newEmail);
                        System.out.println("----------------------student email has successfully updated---------------------------------");
                        break;
                    case 4:
                        System.out.println("\nNow enter the No.Of Subjects and its mark to calculate grade");
                        int noSubject = sc.nextInt();
                        sc.nextLine();

                        double totalMark = 0;
                        for (int i = 1; i <= noSubject; i++) {
                            System.out.println("\nEnter the " + i + " Subject mark");
                            double newMark = sc.nextDouble();
                            totalMark += newMark;
                        }


                        double averageMark = totalMark / noSubject;
                        if (averageMark >= 90 && averageMark <= 100) {
                            grade = 'O';
                        } else if (averageMark >= 80 && averageMark <= 89) {
                            grade = 'A';
                        } else if (averageMark >= 70 && averageMark <= 79) {
                            grade = 'B';
                        } else if (averageMark >= 60 && averageMark <= 69) {
                            grade = 'C';
                        } else if (averageMark > 50 && averageMark <= 59) {
                            grade = 'D';
                        } else if (averageMark <= 49) {
                            grade = 'E';
                        }

                        existingStudent.setGrade(grade);
                        System.out.println("----------------------student marks has successfully updated---------------------------------");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println(e);
            }
    }


    public void displayStudent() {
            System.out.println("\n------------ Student Details ------------");
            studentList.forEach((id, stu) -> System.out.println(stu));
            System.out.println("\n-----------------------------------------");
    }

    public void searchId() {
            System.out.println("\nEnter a Student-Id to search:");
            int newId = sc.nextInt();

            boolean found = false;

            try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
                String line;
                boolean firstLine = true;

                while ((line = reader.readLine()) != null) {
                    if (firstLine) { // Skip header row
                        firstLine = false;
                        continue;
                    }

                    String[] data = line.split(",");
                    int studentId = Integer.parseInt(data[0]); // Get student ID from CSV

                    if (studentId == newId) {
                        found = true;
                        System.out.println("\nStudent Details Found:");
                        System.out.println("ID: " + data[0]);
                        System.out.println("Name: " + data[1]);
                        System.out.println("Age: " + data[2]);
                        System.out.println("Email: " + data[3]);
                        System.out.println("Grade: " + data[4]);
                        break; // Stop searching once found
                    }
                }

                if (!found) {
                    System.out.println("\nThe ID " + newId + " is not present in the CSV file.");
                }
            } catch (IOException e) {
                System.out.println("\nError reading the file: " + e.getMessage());
            }
    }



    public void deleteStudent()
    {
        if (studentList.isEmpty()) {
            System.out.println("\nNo students available.");
            return;
        }
            System.out.println("\nEnter the student id to delete");
            int delId = sc.nextInt();
            studentList.remove(delId);
            System.out.println("-------------------------Deleted successfully------------------------");
    }


    public void saveStudent() {
        if (studentList.isEmpty()) {
            System.out.println("\nYour File is empty, add student data");
            return;
        }
        Runnable saveStudentThread = () -> {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
                if (file.length() == 0) {
                    writer.write("Id,Name,Age,Email-Id,Grade");
                    writer.newLine();
                }

                // Convert map to list and sort by ID (in ascending order)
                List<Map.Entry<Integer, Student>> sortedStudents = new ArrayList<>(studentList.entrySet());
                sortedStudents.sort(new Comparator<Map.Entry<Integer, Student>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Student> entry1, Map.Entry<Integer, Student> entry2) {
                        return entry1.getKey().compareTo(entry2.getKey()); // Compare by student ID
                    }
                });

                for (Map.Entry<Integer, Student> studentEntry : studentList.entrySet()) {
                    Student student = studentEntry.getValue();
                    writer.write(studentEntry.getKey() + "," + student.getStudentName() + "," +
                            student.getStudentAge() + "," + student.getEmail() + "," + student.getGrade());
                    writer.newLine();
                }
            } catch (IOException e) {
                System.out.println("\nError writing to file: " + e.getMessage());
            }
        };
        executor.submit(saveStudentThread);
    }


    public void loadStudent() {
        Runnable loadStudentThread = () -> {
            if (!file.exists()) {
                System.out.println("\nNo such file existts");
            }
            try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
                String line;
                boolean firstLine = true;

                while ((line = reader.readLine()) != null) {
                    if (firstLine) { // Skip header row
                        firstLine = false;
                        continue;
                    }
                    String[] data = line.split(",");
                    if (data.length == 5) {
                        char grade = data[4].charAt(0);
                        studentList.put(Integer.parseInt(data[0]), new Student(
                                Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), data[3], grade
                        ));
                    }
                }
            } catch (IOException e) {
                System.out.println("\nError : " + e.getMessage());
            }
        };
        executor.submit(loadStudentThread);
    }

    public boolean regexCheck(String email)
    {
        String pattern = "^[a-zA-Z0-9][a-zA-Z0-9._-]*@[a-zA-Z0-9.-]+\\.(com|org|net)$";
        Pattern pattern1 = Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher(email);
        return matcher.matches();
    }
}
