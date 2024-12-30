package Day3.Inheritance;
class Cat extends Animal
{
    public void sound()
    {
        System.out.println("Cat meows");
    }
}
class Dog extends Animal
{
    public void sound()
    {
        System.out.println("Dog Barks");
    }
}

public class Animal
{
    public void sound()
    {

    }
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();

        Animal animal1 = new Cat();
        animal1.sound();
    }
}
