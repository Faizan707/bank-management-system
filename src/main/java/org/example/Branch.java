package org.example;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private String location;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Branch(String branchName, String location) {
        this.branchName = branchName;
        this.location = location;
    }

    public String getBranchName() {
        return branchName;
    }

    public String getLocation() {
        return location;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Customer findCustomerById(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    public void showBranchDetails() {
        System.out.println("\n🏦 Branch: " + branchName + " | Location: " + location);
        System.out.println("Total Customers: " + customers.size());
    }
}
