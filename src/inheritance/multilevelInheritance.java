package inheritance;

public class multilevelInheritance {
    public static void main(String[] args) {
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}

//class Animal1 {
//    void eat() {
//        System.out.println("Eating...");
//    }
//}
//
//class Dog1 extends Animal1{
//    void bark(){
//        System.out.println("Barking...");
//    }
//}

class BabyDog extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }
}
