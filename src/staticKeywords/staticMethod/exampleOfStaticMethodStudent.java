package staticKeywords.staticMethod;

public class exampleOfStaticMethodStudent {
    public static void main(String[] args){
        Student.change();
        Student s1 = new Student(111, "Mohit");
        Student s2 = new Student(222, "Muthoot");
        Student s3 = new Student(333, "Muralidhar");

        s1.display();
        s2.display();
        s3.display();
    }
}

class Student{
    int rollNo;
    String name;
    static String college = "Modern college shivajinagar, Pune";

    // Static method to change the value of static variable.
    static void change() {
        college = "IIT";
    }

    // Constructor to initialise the variable
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    // Method to display values
    void display() {
        System.out.println(rollNo +  " " + name + " " + college);
    }
}

