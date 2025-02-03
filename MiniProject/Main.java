package MiniProject;

import java.util.Scanner;

import static MiniProject.Teacher.studentList;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("---------WELCOME TO STUDENT MANAGEMENT SYSTEM---------");
        System.out.println();

        teacher.loadStudent();

        while (true) {
            System.out.println("\n1. Add Student Details" +
                    "\n2. Update Student Details" +
                    "\n3. Display Student Details" +
                    "\n4. Search by Id" +
                    "\n5. Delete Student Details" +
                    "\n6. Exit the System");
            System.out.print("\nEnter your choice: ");

            try {
                choice = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("\nInvalid input! Please enter a number.");
                sc.nextLine();
                continue;
            }

            switch (choice){
                case 1:
                    teacher.createStudent();
                    teacher.saveStudent();
                    break;
                case 2:
                    teacher.updateStudent();
                    teacher.saveStudent();
                    break;
                case 3:
                    teacher.displayStudent();
                    break;
                case 4:
                    teacher.searchId();
                    break;
                case 5:
                    teacher.deleteStudent();
                    teacher.saveStudent();
                    break;
                case 6:
                    studentList.forEach((id,stu) -> System.out.println(stu));
                    System.out.println("\nExiting... Thank you!");
                    sc.close();
                    teacher.executor.shutdown();
                    return;
                default:
                    System.out.println("\nEnter a valid choice.");
                    break;
            }
        }
    }
}
