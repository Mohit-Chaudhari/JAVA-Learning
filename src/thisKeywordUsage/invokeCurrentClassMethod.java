package thisKeywordUsage;

public class invokeCurrentClassMethod {
    public static void main(String[] args){
        A1 obj = new A1();
        obj.n();
    }
}

class A1{
    void m(){
        System.out.println("Hello m");
    }

    void n(){
        System.out.println("Hello n");
        this.m();
    }
}

