package thisKeywordUsage;

public class thisInstanceToReturnCurrentClassInstance {
    public static void main(String[] args){
        new A2().getA().msg();
    }
}

class A2 {
    A2 getA() {
        return this;
    }

    void msg() {
        System.out.println("Hello JAVA !!!");
    }
}
