package MiniProject;

public class Student {
    private int studentId;
    private String studentName;
    private int studentAge;
    private String email;
    private char grade;

    public Student()
    {

    }
    public Student(int studentId, String studentName, int studentAge, String email, char grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.email = email;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                studentId +
                ","+ studentName + '\'' +
                "," + studentAge +
                "," + grade +
                "," + email + '\'';
    }
}
