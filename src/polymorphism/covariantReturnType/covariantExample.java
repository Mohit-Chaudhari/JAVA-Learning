package polymorphism.covariantReturnType;

public class covariantExample {
    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.foo().print();

        A2 a2 = new A2();
        // We need to do the typecasting to make it
        // more clear to reader about the kind of object created
        ((A2)a2.foo()).print();

        A3 a3 = new A3();

        // doing the type casting
        ((A3)a3.foo()).print();
    }
}

class A1{
    A1 foo() {
        return this;
    }

    void print() {
        System.out.println("Inside class A1");
    }
}

class A2 extends A1 {
    @Override
    A1 foo() {
        return this;
    }

    @Override
    void print(){
        System.out.println("Inside class A2");
    }
}

class A3 extends A2 {

    @Override
    A1 foo() {
        return this;
    }

    @Override
    void print() {
        System.out.println("Inside class A3");
    }
}
