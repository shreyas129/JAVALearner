package IntellijStarting.test;

public class ClassesChallengeAccount {
    public static void main(String[] args) {
//        Account prashant = new Account("!75^35$", 2147483647, "Prashant Tathode", "Tathode@gmail.com", "9511667757");

        Account prashant = new Account();

        System.out.println(prashant.getNumber());
        System.out.println(prashant.getBalance());

//        prashant.setNumber("!75^35$");
//        prashant.setBalance(2147483647);
//        prashant.setCustomerName("Prashant Tathode");
//        prashant.setCustomerEmail("Tathode@gmail.com");
//        prashant.setCustomerPhone("9511667757");

        prashant.depositeFunds(2500);
        prashant.withdrawFunds(1237);
        prashant.withdrawFunds(678);

        Account shreyas = new Account("Shreyas", "Shreyas.tathode129@gmail.com", "9511667757");
        System.out.println("Account no: " + shreyas.getNumber());
        System.out.println("Name: " + shreyas.getCustomerName());
        System.out.println("Email address: " + shreyas.getCustomerEmail());
        System.out.println("Phone no: " + shreyas.getCustomerPhone());
        System.out.println("Balance: " + shreyas.getBalance());
    }
}
