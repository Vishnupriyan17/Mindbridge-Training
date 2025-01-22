package Day17;

import java.util.Optional;

public class OptionalDefault {
    public static void main(String[] args) {
        String name = null;
        Optional<String> op = Optional.ofNullable(name);

        System.out.println(op.orElse("Guest"));

    }
}
