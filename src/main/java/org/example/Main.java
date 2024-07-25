package org.example;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500, "John Doe");
        account.deposit(500);
        System.out.println(account.toString());

        // Bank transfer
        BankAccount account1 = new BankAccount(5000, "Peyton Garcia");
        BankAccount account2 = new BankAccount(300, "Christian Garcia");
        account1.withdrawal(100);
        account2.deposit(100);
        System.out.println(account1.toString());
        System.out.println(account2.toString());

        // Product
        Product candyBars = new Product("candy", 4.99, 10);
        candyBars.printProduct(5);
        candyBars.totalCost(5);

    }
}
