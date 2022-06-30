package objectsAndClasses;

public class initialisationOfObjectsThroughReference {
    int id;
    String name;
}

class Student {
    public static void main(String[] args) {
        initialisationOfObjectsThroughReference s1 = new initialisationOfObjectsThroughReference();
        s1.id = 101;
        s1.name = "Mohit";
        System.out.println("Name : " + s1.name);
        System.out.println("Id : " + s1.id);
    }
}
