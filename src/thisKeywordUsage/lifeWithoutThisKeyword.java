package thisKeywordUsage;

public class lifeWithoutThisKeyword {
    public static void main(String[] args){
        Student s1 = new Student(111, "Mohit", 25);
        Student s2 = new Student(222, "Muthoot", 30);

        s1.display();
        s2.display();
    }
}

class Student {
    int rollNo;
    String name;
    float fee;

    Student(int rollNo, String name, float fee){
        rollNo = rollNo;
        name = name;
        fee = fee;
    }

    void display(){
        System.out.println(rollNo + " " + name + " " + fee);
    }
}
