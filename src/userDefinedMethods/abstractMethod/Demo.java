package userDefinedMethods.abstractMethod;

// Abstract Method
// The method that does not has method body is known as abstract method.
// In other words, without an implementation is known as abstract method.
// It always declares in the abstract class.
// It means the class itself must be abstract if it has abstract method.
// To create an abstract method, we use the keyword abstract.

// Syntax

// abstract void method_name();

abstract class Myclass {
    abstract void display();
}

public class Demo extends Myclass{
    void display(){
        System.out.println("Abstract method");
    }

    public static void main(String[] args){
        Myclass obj = new Demo();
        // Invoking abstract method
        obj.display();
    }
}