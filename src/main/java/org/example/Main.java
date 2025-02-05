package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank("National Bank");

        // Adding some branches
        Branch lahoreBranch = new Branch("Lahore Branch", "Lahore");
        Branch karachiBranch = new Branch("Karachi Branch", "Karachi");
        bank.addBranch(lahoreBranch);
        bank.addBranch(karachiBranch);

        System.out.println("🏦 Welcome to " + bank.bankName);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Want to register your self in our bank");
            System.out.println("2. Open an account");
            System.out.println("3. Deposit money");
            System.out.println("4. View customer details");
            System.out.println("5. Show branch details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                // Register a new customer
                System.out.println("Available Branches: Lahore Branch, Karachi Branch");
                System.out.print("Enter branch name: ");
                String branchName = scanner.nextLine();
                Branch branch = bank.findBranchByName(branchName);

                if (branch != null) {
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter your email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter your phone number: ");
                    String phoneNo = scanner.nextLine();

                    Customer newCustomer = new Customer(name, email, phoneNo);
                    branch.addCustomer(newCustomer);

                    System.out.println("\n✅ Customer registered in " + branch.getBranchName());
                    newCustomer.showDetails();
                } else {
                    System.out.println("\n❌ Branch not found.");
                }

            } else if (choice == 2) {
                // Open an account
                System.out.print("Enter branch name: ");
                String branchName = scanner.nextLine();
                Branch branch = bank.findBranchByName(branchName);

                if (branch != null) {
                    System.out.print("Enter customer ID: ");
                    int id = scanner.nextInt();
                    Customer foundCustomer = branch.findCustomerById(id);

                    if (foundCustomer != null) {
                        System.out.print("Enter initial deposit amount: ");
                        double deposit = scanner.nextDouble();
                        foundCustomer.openAccount(deposit);
                    } else {
                        System.out.println("\n❌ Customer not found.");
                    }
                } else {
                    System.out.println("\n❌ Branch not found.");
                }

            } else if (choice == 3) {
                // Deposit money
                System.out.print("Enter branch name: ");
                String branchName = scanner.nextLine();
                Branch branch = bank.findBranchByName(branchName);

                if (branch != null) {
                    System.out.print("Enter customer ID: ");
                    int id = scanner.nextInt();
                    Customer foundCustomer = branch.findCustomerById(id);

                    if (foundCustomer != null && foundCustomer.getAccount() != null) {
                        System.out.print("Enter deposit amount: ");
                        double deposit = scanner.nextDouble();
                        foundCustomer.getAccount().deposit(deposit);
                        foundCustomer.getAccount().showAccountDetails();
                    } else {
                        System.out.println("\n❌ Customer does not have an account.");
                    }
                } else {
                    System.out.println("\n❌ Branch not found.");
                }

            } else if (choice == 4) {
                // View customer details
                System.out.print("Enter branch name: ");
                String branchName = scanner.nextLine();
                Branch branch = bank.findBranchByName(branchName);

                if (branch != null) {
                    System.out.print("Enter customer ID: ");
                    int id = scanner.nextInt();
                    Customer foundCustomer = branch.findCustomerById(id);

                    if (foundCustomer != null) {
                        foundCustomer.showDetails();
                    } else {
                        System.out.println("\n❌ Customer not found.");
                    }
                } else {
                    System.out.println("\n❌ Branch not found.");
                }

            } else if (choice == 5) {
                // Show branch details
                System.out.print("Enter branch name: ");
                String branchName = scanner.nextLine();
                Branch branch = bank.findBranchByName(branchName);

                if (branch != null) {
                    branch.showBranchDetails();
                } else {
                    System.out.println("\n❌ Branch not found.");
                }

            } else if (choice == 6) {
                System.out.println("Exiting... Have a great day!");
                break;

            } else {
                System.out.println("❌ Invalid choice. Please enter a valid option.");
            }
        }

        scanner.close();
    }
}
