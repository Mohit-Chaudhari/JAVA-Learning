package controlStatements.decisionMakingStatements.switchStatemnt;

public class Student implements Cloneable{
    public static void main(String[] args) {
        int num = 2;
        switch(num){
            case 0: System.out.println("Your roll number is 0"); break;
            case 1: System.out.println("Your roll number is 1"); break;
            default: System.out.println("Your roll number is "+ num);
        }
    }
}
