package controlStatements.decisionMakingStatements.jumpStatements;

public class breakStatement {
    public static void main(String[] args) {
        // Break example program
        for(int i=0; i <= 10; i++){
            System.out.println(i);
            if(i == 6) {
                break;
            }
        }
    }
}
