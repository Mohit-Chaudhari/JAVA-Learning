package controlStatements.decisionMakingStatements.IfStatement;

public class ifElseIfLadder {
    public static void main(String[] args) {
        String city = "Delhi";

        if(city=="Nashik") {
            System.out.println("City is Nashik");
        }
        else if(city == "Pune") {
            System.out.println("City is Pune");
        }
        else if(city == "Mumbai"){
            System.out.println("City is Mumbai");
        }
        else {
            System.out.println("City is " + city);
        }
    }
}
