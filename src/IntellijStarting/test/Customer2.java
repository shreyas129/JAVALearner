package IntellijStarting.test;

import java.util.ArrayList;

public class Customer2 {
    private String name;
    private ArrayList<Double> transactions;

    public Customer2(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        transactions.add(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction) {
         transactions.add(transaction);
    }
}
