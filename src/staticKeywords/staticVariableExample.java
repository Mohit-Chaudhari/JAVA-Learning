package staticKeywords;

// If you declare any variable as static, it is known as a static variable.
// The static variable can be used to refer to the common property of all objects (which is not unique for each object),
// for example, the company name of employees, college name of students, etc.
// The static variable gets memory only once in the class area at the time of class loading.

// Advantages of static variable
// It makes your program memory efficient (i.e., it saves memory).

class Student{
    int rollNo;
    String name;
    static String college = "Modern College, Shivajinagar, Pune";

    // constructor
    Student(int r, String n){
        rollNo = r;
        name = n;
    }

    void display(){
        System.out.println(rollNo + " " + name + " " + college);
    }
}

public class staticVariableExample {
    public static void main(String[] args){
        Student s1 = new Student(111, "Mohit");
        Student s2 = new Student(222, "Muthoot");
        s1.display();
        s2.display();
    }
}
