package controlStatements.decisionMakingStatements.IfStatement;

public class nestedIfElseStatement {
    public static void main(String[] args) {
        String address = "Nashik, India";

        if(address.endsWith("India")){
            if(address.contains("Nashik")){
                System.out.println("Your city is Nashik");
            }
            else if(address.contains("Pune")){
                System.out.println("Your city is Pune");
            }
            else {
                System.out.println("Your city is Mumbai");
            }
        }
        else {
            System.out.println("You are not living in india");
        }
    }
}
