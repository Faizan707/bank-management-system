public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("My Bank");

        Branch branch = new Branch("Main Branch");
        bank.addBranch(branch);

        Customer customer1 = new Customer("John Doe");
        branch.addCustomer(customer1);

        Account account1 = new Account("Checking", 1000.00);
        customer1.addAccount(account1);

        Account account2 = new Account("Savings", 5000.00);
        customer1.addAccount(account2);

        System.out.println("Customer: " + customer1.getName());
        for (Account account : customer1.getAccounts()) {
            System.out.println(account);
        }

        branch.removePerson(customer1.getId());
        System.out.println("Branch customers after removal: " + branch.getCustomers().size());
    }
}
