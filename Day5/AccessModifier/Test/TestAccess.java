package Day5.AccessModifier.Test;

import Day5.AccessModifier.Details.Person;

public class TestAccess {
    public static void main(String[] args) {
        Person person = new Person("Vishnupriyan",21,"6,New hospital",12345.67);
        System.out.println("Name is accessible: "+person.name+
                "\n Age is not accessible: "+"\n Address is not accessible: "+"\n Salary is not accessible: ");
    }
}
