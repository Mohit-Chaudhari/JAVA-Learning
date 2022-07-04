package inheritance;

import userDefinedMethods.Addition;

public class AggregationExample {
    int id;
    String name;
    Address address;

    public AggregationExample(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("Nashik", "Maharashtra", "India");
        Address address2 = new Address("Bengaluru", "Karnataka", "India");

        AggregationExample e1 = new AggregationExample(111, "Mohit", address1);
        AggregationExample e2 = new AggregationExample(222, "Murali", address2);

        e1.display();
        e2.display();
    }
}
