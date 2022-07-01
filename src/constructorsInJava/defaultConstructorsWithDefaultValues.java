package constructorsInJava;

public class defaultConstructorsWithDefaultValues {
    int id;
    String name;

    void display(){
        System.out.println(id + " " + name);
    }

    public static void main(String[] args){
        defaultConstructorsWithDefaultValues d1 = new defaultConstructorsWithDefaultValues();
        defaultConstructorsWithDefaultValues d2 = new defaultConstructorsWithDefaultValues();
        d1.display();
        d2.display();
    }
}
