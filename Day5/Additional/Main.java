package Day5.Additional;
import Day5.Additional.Utilities.Container;
import Day5.Additional.Utilities.Priority;
public class Main {
    public static void main(String[] args) {
        Priority priority = Priority.HIGH;
        Integer priorityLevel = Priority.HIGH.ordinal();
        System.out.println("Priority level is: "+priorityLevel+"\nPriority Name: "+priority.name());

        Container<Integer> container = new Container<>(priorityLevel);
        System.out.println("stored value is: "+container.getValue());

        Container<String> container1 = new Container<>("Vishnupriyan");
        System.out.println("stored name is: "+container1.getValue());
    }
}
