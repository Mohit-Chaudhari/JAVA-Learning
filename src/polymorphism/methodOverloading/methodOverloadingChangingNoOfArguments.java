package polymorphism.methodOverloading;

import inheritance.Address;

public class methodOverloadingChangingNoOfArguments {
    public static void main(String[] args){
        System.out.println(Adder.add(11, 11));
        System.out.println(Adder.add(22, 22));
        System.out.println(Adder.add(11, 11, 11));
        System.out.println(Adder.add(22, 22, 22));
    }
}

class Adder {
    static int add(int a, int b) { return a + b; }
    static int add(int a, int b, int c) { return a + b + c; }
}
