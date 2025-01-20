package Day3.Interface;
class Cat implements Animal{
    public void eat()
    {
        System.out.println("Cat eat");
    }

    public void sleep() {
        System.out.println("Cat sleep");
    }
}
class Dog implements Animal {
    public void eat()
    {
        System.out.println("Dog eat");
    }

    public void sleep() {
        System.out.println("Dog sleep");
    }
}
public interface Animal {
    abstract void eat();
    abstract void sleep();

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        animal.sleep();
        Animal animal1 = new Cat();
        animal1.eat();
        animal1.sleep();
    }
}

