package constructorsInJava;

public class constructorOverloading {
    int id;
    String name;
    int age;

    constructorOverloading(int id, String n){
        this.id = id;
        this.name = n;
    }

    constructorOverloading(int i, String n, int a){
        this.id = i;
        this.name = n;
        this.age = a;
    }

    void display(){
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args){
        constructorOverloading c1 = new constructorOverloading(111, "Mohit");
        constructorOverloading c2 = new constructorOverloading(222, "Muthoot", 148);
        c1.display();
        c2.display();
    }
}
