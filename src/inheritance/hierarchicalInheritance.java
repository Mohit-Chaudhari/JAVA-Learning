package inheritance;

public class hierarchicalInheritance {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.meow();
        c.eat();

        Dog3 d = new Dog3();
        d.bark();
        d.eat();
    }
}

class Animal3{
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog3 extends Animal3{
    void bark() {
        System.out.println("Barking...");
    }
}

class Cat extends Animal{
    void meow() {
        System.out.println("Meowing...");
    }
}
