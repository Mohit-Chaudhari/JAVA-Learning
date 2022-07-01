package staticKeywords;

public class counterWithoutStaticVariable {
    int count = 0;

    counterWithoutStaticVariable(){
        count++; // Incrementing value
        System.out.println(count);
    }

    public static void main(String[] args){
        counterWithoutStaticVariable c1 = new counterWithoutStaticVariable();
        counterWithoutStaticVariable c2 = new counterWithoutStaticVariable();
        counterWithoutStaticVariable c3 = new counterWithoutStaticVariable();
    }
}
