package controlStatements.decisionMakingStatements.loopStatement;

public class forLoop {
    // calculation program
    public static void main(String[] args) {
        int sum = 0;
        for(int j=1; j<=10;j++){
            sum = sum + j;
        }
        System.out.println("The Sum of first 10 natural numbers is " + sum);
    }
}
