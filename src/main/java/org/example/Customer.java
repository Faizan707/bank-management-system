package org.example;

public class Customer extends Person {
    private static int customerIDCounter = 1;
    private int id;
    private Account account;

    public Customer(String name, String email, String phoneNO) {
        super(name, email, phoneNO);
        this.id = customerIDCounter++;
    }

    public int getId() {
        return id;
    }

    public void openAccount(double initialDeposit) {
        if (account == null) {
            this.account = new Account(initialDeposit);
            System.out.println("\n✅ Account opened successfully!");
            account.showAccountDetails();
        } else {
            System.out.println("\n❌ You already have an account.");
        }
    }

    public void showDetails() {
        System.out.println("\n👤 ID: " + id + ", Name: " + getName() + ", Email: " + getEmail() + ", Phone: " + getPhoneNO());
        if (account != null) {
            account.showAccountDetails();
        } else {
            System.out.println("❌ No account opened yet.");
        }
    }

    public Account getAccount() {
        return account;
    }
}
