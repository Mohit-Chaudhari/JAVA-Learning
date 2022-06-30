package controlStatements.decisionMakingStatements.loopStatement;

public class doWhileLoop {
    // Calculation program
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Printing even numbers upto 10: ");
        do {
            System.out.println(i);
            i += 2;
        } while (i <= 10);
    }
}
