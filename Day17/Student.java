package Day17;

public class Student {
    String name;
    int mark;
    Student(String name,int mark)
    {
        this.name = name;
        this.mark = mark;
        System.out.println("Values are added successfully");
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void displayStudentDetails()
    {
        System.out.println(getName());
        System.out.println(getMark());
    }
}
