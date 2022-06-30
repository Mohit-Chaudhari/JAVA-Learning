package objectsAndClasses;

public class objectAndClassExampleEmployee {
    int id;
    String name;
    float salary;

    void insert(int i, String n, float s) {
        id = i;
        name = n;
        salary = s;
    }

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
    }
}

class TestEmployee{
    public static void main(String[] args) {
        objectAndClassExampleEmployee s1 = new objectAndClassExampleEmployee();
        objectAndClassExampleEmployee s2 = new objectAndClassExampleEmployee();
        objectAndClassExampleEmployee s3 = new objectAndClassExampleEmployee();

        s1.insert(101, "Mohit", 45000);
        s2.insert(102, "Hrishikesh", 55000);
        s3.insert(103, "Murali", 65000);

        s1.display();
        s2.display();
        s3.display();
    }
}
