package Day17;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SimpleSupplier {
    SimpleSupplier()
    {
        Supplier<LocalDateTime> dateTimeSupplier = () -> LocalDateTime.now();
        System.out.println(dateTimeSupplier.get());
    }

    public static void main(String[] args) {
        SimpleSupplier supp = new SimpleSupplier();
    }
}
