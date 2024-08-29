public class Account {
    private static int ACCOUNT_ID = 1;

    private int accountId;
    private double balance;
    private String accountType;

    public Account(String accountType, double initialBalance) {
        this.accountId = ACCOUNT_ID++;
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    public int getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Account ID: " + accountId + ", Type: " + accountType + ", Balance: " + balance;
    }
}
