package org.example;

import java.util.ArrayList;

public class Bank {
    String bankName;
    private ArrayList<Branch> branches = new ArrayList<>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void addBranch(Branch branch) {
        branches.add(branch);
    }

    public Branch findBranchByName(String name) {
        for (Branch branch : branches) {
            if (branch.getBranchName().equalsIgnoreCase(name)) {
                return branch;
            }
        }
        return null;
    }

    public void showBankDetails() {
        System.out.println("\n🏦 Bank: " + bankName);
        System.out.println("Total Branches: " + branches.size());
    }
}
