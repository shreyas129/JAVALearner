package IntellijStarting.test;

public class ConstructorChallengeCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer("Shreyas", 60000, "Shreyas.Tathode129@gmail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmail());

        Customer ThirdCustomer = new Customer("Swapnaja", "Swapnaja.bangle@gmail.com");
        System.out.println(ThirdCustomer.getName());
        System.out.println(ThirdCustomer.getCreditLimit());
        System.out.println(ThirdCustomer.getEmail());
    }
}
