package thisKeywordUsage;

public class callingDefaultConstructorFromParameterisedConstructorUsingThisKeyword {
    public static void main(String[] args){
        A a = new A(10);
    }
}

class A {
    A(){
        System.out.println("Hello from default constructor");
    }

    A(int a){
        this();
        System.out.println("Hello from parameterised constructor with value " + a);
    }
}
