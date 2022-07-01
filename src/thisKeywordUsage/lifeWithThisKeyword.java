package thisKeywordUsage;

public class lifeWithThisKeyword {
    public static void main(String[] args) {
        Student1 s1 = new Student1(111, "Mohit", 44);
        Student1 s2 = new Student1(222, "Muthoot", 33);

        s1.display();
        s2.display();
    }
}

class Student1{

    int rollNo;
    String name;
    float fee;

    Student1(int rollNo, String name, float fee){
        this.rollNo = rollNo;
        this.name = name;
        this.fee = fee;
    }

    void display(){
        System.out.println(rollNo + " " + name + " " + fee);
    }
}