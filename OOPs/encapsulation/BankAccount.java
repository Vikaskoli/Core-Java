package OOPs.encapsulation;

import java.lang.invoke.LambdaMetafactory;

public class BankAccount {
    //encapsulated data
    private String accountNumber;
    private double balance;

    //parameterised/custom constructor to initialize account number and balance
   public BankAccount(String accountNumber,double balance){
       this.accountNumber = accountNumber;
       this.balance = balance;
   }

    // Getter method for account number and balance
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Setter method for balance (e.g., to deposit money)

    public void deposit(double amount) {
        if (amount>0){
            balance =balance+ amount;
            System.out.println("Deposited:" +amount);
        }else{
            System.out.println("Deposite amount must be possitive. ");
        }
    }

    //Method to withdraw money from account
    public void withdraw(double amount){
        if (amount>0 && amount <= balance){
            balance = balance - amount;
            System.out.println("Withdraw: "+ amount);
        }else{
            System.out.println("Invalid withdrawal amount.");
        }

    }

    public static void main(String[] args) {
        // Create a new BankAccount object
        BankAccount myAccount = new BankAccount("12345", 500.0);
        // Access account number using getter method
        System.out.println("Account Number: " + myAccount.getAccountNumber());

        // Access and display balance using getter method
        System.out.println("Initial Balance: $" + myAccount.getBalance());

        // Deposit money
        myAccount.deposit(150.0);
        System.out.println("Balance after deposit: $" + myAccount.getBalance());

        // Withdraw money
        myAccount.withdraw(100.0);
        System.out.println("Balance after withdrawal: $" + myAccount.getBalance());

        // Attempt to withdraw an invalid amount
        myAccount.withdraw(1000.0);
    }
}
