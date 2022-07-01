package objectsAndClasses;

public class objectAndClassExampleBankingSystem {
    public static void main(String[] args){
        Account a1 = new Account();
        a1.insert(100000, "Mohit", 1000);
        a1.display();
        a1.checkBalance();
        a1.deposit(10000);
        a1.checkBalance();
        a1.withdraw(15000);
        a1.checkBalance();
    }
}

class Account{
    int acc_no;
    String name;
    float amount;

    // Method to initialise the object
    void insert(int a, String n, float amt){
        acc_no = a;
        name = n;
        amount = amt;
    }

    // Deposit method
    void deposit(float amt){
        amount += amt;
        System.out.println(amt + " ");
    }

    // Withdraw amount
    void withdraw(float amt){
        if(amount<amt){
            System.out.println("Insufficient balance");
        }
        else{
            amount -= amt;
            System.out.println(amt + "Withdrawn");
        }
    }

    // Method to check the balance of an account
    void checkBalance(){
        System.out.println("Balance is " + amount);
    }

    // Methods to display value of an object
    void display(){
        System.out.println(acc_no + " " + name + " " + amount);
    }
}
