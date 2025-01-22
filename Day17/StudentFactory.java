package Day17;
@FunctionalInterface
public interface StudentFactory {
    public Student create(String name,int mark);
}
