package Day17;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String name = null;
        Optional<String> op = Optional.ofNullable(name);
        if(op.isPresent())
        {
            System.out.println(name.toUpperCase());
        }
        else {
            System.out.println("Empty Output");
        }
    }
}
