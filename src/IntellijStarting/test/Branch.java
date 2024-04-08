package IntellijStarting.test;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer2> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer2>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer2> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction){
        Customer2 customer = findCustomer(customerName);
        if (customer != null) {
            return false;
        }
        Customer2 customer1 = new Customer2(customerName, initialTransaction);
        customers.add(customer1);
        return true;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        var customer = findCustomer(customerName);
        if (customer != null) {
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer2 findCustomer(String customerName) {
        for (var customer : customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }
}
