package polymorphism.superKeyword;

public class superKeywordToInvokeParentClassMethod {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.work();
    }
}

class Animal1 {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog1 extends Animal1{
    void eat() {
        System.out.println("Eating bread");
    }

    void bark() {
        System.out.println("Barking");
    }

    void work() {
        super.eat();
        bark();
    }
}
