package Day3.Inheritance;
class Car extends Vehicle{
    @Override
    public void start() {
        System.out.println("Car starts");
    }
}
public class Vehicle {
    public void start()
    {
        System.out.println("Vehicle starts");
    }
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle vehicle1 = new Car();
        vehicle.start();
        vehicle1.start();
    }
}
