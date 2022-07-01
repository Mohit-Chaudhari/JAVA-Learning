package thisKeywordUsage;

public class reusingConstructorUsingThisKeyword {
    public static void main(String[] args) {
        Student2 s1 = new Student2(111, "Mohit", "JAVA");
        Student2 s2 = new Student2(222, "Muthoot", "SpringBoot", 6000f);
        s1.display();
        s2.display();
    }
}

class Student2{
    int rollNo;
    String name, course;
    float fee;

    Student2(int rollNo, String name, String course){
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    Student2(int rollNo, String name, String course, float fee) {
        this(rollNo, name, course);
        this.fee = fee;
    }

    void display(){
        System.out.println(rollNo + " " + name + " " + course + " " + fee);
    }
}