package IntellijStarting.test;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account() {
        this("123456", 2.50, "Deafault name", "Deafault address", "Deafault phone");
        System.out.println("Empty constructer called");
    }

    public Account(String number, double balance, String customerName, String email, String phone) {
        System.out.println("Account constructer with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhone = phone;
    }

    public Account(String customerName, String customerEmail, String customerPhone) {
        this("!2#%46", 9800, customerName, customerEmail, customerPhone);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.customerPhone = customerPhone;
    }

    public void depositeFunds(double depositeAmount) {
        balance += depositeAmount;
        System.out.println("Deposite of ₹ " + depositeAmount + " made. New balance is ₹ " + balance);
    }

    public void withdrawFunds(double withdrawalAmount) {
        if (balance - withdrawalAmount < 0) {
            System.out.println("Insufficient Funds! You only have ₹" + balance + " in Your account.");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of ₹" + withdrawalAmount + " processed, Remaining balance = ₹" + balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
