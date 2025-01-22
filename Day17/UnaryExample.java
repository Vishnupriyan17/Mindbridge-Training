package Day17;

import java.util.function.UnaryOperator;

public class UnaryExample {
    String name;
    public UnaryExample(String name)
    {
        this.name = name;
        UnaryOperator<String> toUpper = (convert) -> name.toUpperCase();
        String na = toUpper.apply(name);
        System.out.println(na);
    }
    public static void main(String[] args) {

        UnaryExample unaryExample = new UnaryExample("vishnu");
    }
}
