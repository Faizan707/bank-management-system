
import java.util.ArrayList;

public class Branch {
    private static int BRANCH_ID = 1;

    private int id;
    private String name;
    private ArrayList<Customer> customers;
    private ArrayList<Employee> employees;

    public Branch(String name) {
        customers = new ArrayList<Customer>();
        employees = new ArrayList<Employee>();
        this.id = BRANCH_ID;
        BRANCH_ID++;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public boolean isCustomer(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return true;
            }
        }

        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return false;
            }
        }

        return false;
    }

    public boolean isPersonExist(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return true;
            }
        }

        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return true;
            }
        }

        return false;
    }

    public Customer getCustomer(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }

        return null;
    }

    public Employee getEmployee(int id) {
        for(int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);

            if (employee.getId() == id) {
                return employee;
            }
        }

        return null;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removePerson(int id) {
        Customer customer = getCustomer(id);

        if (customer != null) {
            customers.remove(customer);
            return;
        }

        Employee employee = getEmployee(id);

        if (employee != null) {
            employees.remove(employee);
        }
    }

}
