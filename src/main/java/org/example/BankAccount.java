package org.example;

public class BankAccount {
    private double balance;
    private String accountHolderName;

    public BankAccount(double balance, String accountHolderName) {
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdrawal(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public String toString() {
        return "Account Holder: " + this.accountHolderName + ", Balance: " + this.balance;
    }




}
