package Day2.OOP_Basics;
class Animal{
    public void speak()
    {
        System.out.println("Animals makes sound");
    }
}
class Dog extends Animal{
    public void speak() {
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    public void speak() {
        System.out.println("Cat meow");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.speak();
        Animal obj1 = new Dog();
        obj1.speak();
        Animal obj2 = new Cat();
        obj2.speak();
    }
}
