package Day5.Additional.Utilities;

public class Container <T>{
    private T value;
    public Container(T value)
    {
        this.value = value;
    }
    public T getValue()
    {
        return value;
    }
}
