package org.example;

public class Account {
    private static int accountNumberCounter = 1000;
    private int accountNumber;
    private double balance;

    public Account(double initialDeposit) {
        this.accountNumber = accountNumberCounter++;
        this.balance = initialDeposit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("\n✅ Successfully deposited: $" + amount);
        } else {
            System.out.println("\n❌ Invalid deposit amount.");
        }
    }

    public void showAccountDetails() {
        System.out.println("\n🏦 Account Number: " + accountNumber);
        System.out.println("💰 Balance: $" + balance);
    }
}
