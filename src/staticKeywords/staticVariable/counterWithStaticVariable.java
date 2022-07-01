package staticKeywords.staticVariable;

public class counterWithStaticVariable {
    static int count = 0;

    counterWithStaticVariable() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args){
        counterWithStaticVariable c1 = new counterWithStaticVariable();
        counterWithStaticVariable c2 = new counterWithStaticVariable();
        counterWithStaticVariable c3 = new counterWithStaticVariable();
    }
}
