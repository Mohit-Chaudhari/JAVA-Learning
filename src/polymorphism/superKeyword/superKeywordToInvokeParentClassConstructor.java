package polymorphism.superKeyword;

public class superKeywordToInvokeParentClassConstructor {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
    }
}

class Animal2 {
    Animal2() {
        System.out.println("Animal created");
    }
}

class Dog2 extends Animal2{
    Dog2() {
        super();
        System.out.println("The dog is created");
    }
}