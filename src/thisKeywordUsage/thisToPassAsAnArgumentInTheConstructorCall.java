package thisKeywordUsage;

public class thisToPassAsAnArgumentInTheConstructorCall {
    int data = 10;
    thisToPassAsAnArgumentInTheConstructorCall(){
        B b = new B(this);
        b.display();
    }

    public static void main(String[] args){
        thisToPassAsAnArgumentInTheConstructorCall a = new thisToPassAsAnArgumentInTheConstructorCall();
    }
}

class B {
    thisToPassAsAnArgumentInTheConstructorCall obj;
    B(thisToPassAsAnArgumentInTheConstructorCall obj){
        this.obj = obj;
    }

    void display(){
        System.out.println(obj.data);
    }
}
