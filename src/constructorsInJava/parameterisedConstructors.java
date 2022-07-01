package constructorsInJava;

public class parameterisedConstructors {
    int id;
    String name;

    parameterisedConstructors(int i, String n){
        id = i;
        name = n;
    }

    void display(){
        System.out.println(id + " " + name);
    }

    public static void main(String[] args){
        parameterisedConstructors p1 = new parameterisedConstructors(111, "Mohit");
        parameterisedConstructors p2 = new parameterisedConstructors(222, "Muthoot");

        p1.display();
        p2.display();
    }
}
