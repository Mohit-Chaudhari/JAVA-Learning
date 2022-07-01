package userDefinedMethods.instanceMethod;

//Accessor Method: The method(s) that reads the instance variable(s) is known as the accessor method. We can easily identify it because the method is prefixed with the word get. It is also known as getters. It returns the value of the private field. It is used to get the value of the private field.
//
//        Example
//
//public int getId()
//        {
//        return Id;
//        }
//        Mutator Method: The method(s) read the instance variable(s) and also modify the values. We can easily identify it because the method is prefixed with the word set. It is also known as setters or modifiers. It does not return anything. It accepts a parameter of the same data type that depends on the field. It is used to set the value of the private field.
//
//        Example
//
//public void setRoll(int roll)
//        {
//        this.roll = roll;
//        }

public class Student {
    private int roll;
    private String name;

    public int getRoll(){
        return roll;
    }

    public void setRoll(int roll){
        this.roll = roll;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void display(){
        System.out.println("Roll No : " + this.roll);
        System.out.println("Name : " +  this.name);
    }
}

class Student1{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.display();
        s1.setName("Mohit");
        System.out.println("The name is " + s1.getName());
        s1.setRoll(10);
        System.out.println("The roll number is " + s1.getRoll());
        s1.display();
    }
}
