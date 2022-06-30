package objectsAndClasses;

public class mainOutsideTheClass {
    int id=10;
    String name="Mohit";
}

class TestStudent{
    public static void main(String[] args) {
        mainOutsideTheClass s1 = new mainOutsideTheClass();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}
