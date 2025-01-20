package Day3.Abstract;

class Fan extends Appliance{
    @Override
    void turnOn() {
        System.out.println("Turned On");
    }
}
abstract class Appliance {
    abstract void turnOn();
    public static void turnOff()
    {
        System.out.println("Truned Off");
    }
    public static void main(String[] args) {
        Fan fan= new Fan();
        fan.turnOff();
        fan.turnOn();
    }
}
