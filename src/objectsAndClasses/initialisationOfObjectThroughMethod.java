package objectsAndClasses;

public class initialisationOfObjectThroughMethod {
    int rollNo;
    String name;

    void insertRecord(int r, String n) {
        rollNo = r;
        name = n;
    }

    void displayInformation() {
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollNo);
    }
}

class Student1 {
    public static void main(String[] args) {
        initialisationOfObjectThroughMethod s1 = new initialisationOfObjectThroughMethod();
        initialisationOfObjectThroughMethod s2 = new initialisationOfObjectThroughMethod();

        s1.insertRecord(1, "Mohit");
        s2.insertRecord(2, "Nashik");

        s1.displayInformation();
        s2.displayInformation();
    }
}
