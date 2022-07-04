package polymorphism.methodOverloading;

public class methodOverloadingChangingDataTypesOfArguments {
    public static void main(String[] args) {
        System.out.println(Adder1.add(10, 20));
        System.out.println(Adder1.add(12.3, 11.2));
    }
}

class Adder1{
    static int add(int a, int b) { return a + b; }
    static double add(double a, double b) { return a + b; }
}
