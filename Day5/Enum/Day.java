package Day5.Enum;

public enum Day {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday;

    public static void show(Day day){
        switch(day){
            case Saturday:
            case Sunday:
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Weekdays");
        }
    }

    public static void main(String[] args) {
        show(Day.Monday);
        show(Day.Tuesday);
        show(Day.Wednesday);
        show(Day.Thursday);
        show(Day.Friday);
        show(Day.Saturday);
        show(Day.Sunday);
    }
}
