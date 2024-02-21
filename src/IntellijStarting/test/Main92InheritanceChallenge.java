package IntellijStarting.test;

public class Main92InheritanceChallenge {
    public static void main(String[] args) {
        Employee prashant = new Employee("Prashant", "4/01/1980", "7/05/2022");
        System.out.println(prashant);
        System.out.println("Age = " + prashant.getAge());
        System.out.println("Pay = " + prashant.collectPay());

        Employee joe = new Employee("Joe", "11/11/1990", "03/03/2020");
        System.out.println(joe);
    }
}
