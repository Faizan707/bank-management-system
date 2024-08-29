import java.util.ArrayList;

public class Customer extends Person {
    private ArrayList<Account> accounts;

    public Customer(String name) {
        super(name);
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account getAccount(int accountId) {
        for (Account account : accounts) {
            if (account.getAccountId() == accountId) {
                return account;
            }
        }
        return null;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void removeAccount(int accountId) {
        Account account = getAccount(accountId);
        if (account != null) {
            accounts.remove(account);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Accounts: " + accounts.size();
    }
}
