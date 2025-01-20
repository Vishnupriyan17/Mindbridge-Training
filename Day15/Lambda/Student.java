package Day15.Lambda;

public class Student {
    int rollno;
    String name ;
    double cgpa;
    String department;

    @Override
    public String toString() {
        return "rollno " + rollno +
                " = cgpa=" + cgpa;
    }

    Student()
    {

    }
    Student(int rollno,String name,double cgpa,String department)
    {
        this.rollno = rollno;
        this.name = name;
        this.cgpa = cgpa;
        this.department = department;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
