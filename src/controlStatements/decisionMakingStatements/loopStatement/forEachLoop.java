package controlStatements.decisionMakingStatements.loopStatement;

public class forEachLoop {
    // Calculation program
    public static void main(String[] args) {
        String[] names = {"JAVA", "C", "C++", "Python", "JAVASCRIPT"};
        System.out.println("Printing the content of the array names,");
        for(String name: names){
            System.out.println(name);
        }
    }
}
