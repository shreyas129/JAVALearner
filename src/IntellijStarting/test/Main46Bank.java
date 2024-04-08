package IntellijStarting.test;

import java.util.ArrayList;

public class Main46Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Main46Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public static void main(String[] args) {
        Main46Bank bank = new Main46Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);
        bank.addCustomer("Adelaide", "Percy", 221.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            Branch branch = new Branch(branchName);
            branches.add(branch);
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            boolean b =   branch.newCustomer(customerName, initialTransaction);
            return b;
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (var branch : branches) {
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }
        System.out.println("Customer details for branch " + branchName);
        int i = 1;
        for (Customer2 customer : branch.getCustomers()) {
            System.out.println("Customer: " + customer.getName() + "[" + i + "]");
            i++;
            int j = 1;
            if (printTransactions) {
                System.out.println("Transactions");
                for (Double transaction : customer.getTransactions()) {
                    System.out.println("[" + j + "] Amount " + transaction);
                    j++;
                }
            }
        }
        return true;
    }
}