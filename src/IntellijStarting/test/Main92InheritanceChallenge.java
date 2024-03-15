package IntellijStarting.test;

public class Main92InheritanceChallenge {
    public static void main(String[] args) {
        Employee pratik = new Employee("Pratik", "18/03/2014", "03/03/2020");
        System.out.println(pratik);
        System.out.println("Age = " + pratik.getAge());
        System.out.println("Pay = " + pratik.collectPay());
        SalariedEmployee prashant = new SalariedEmployee("Prashant", "4/01/1980", "7/05/2022", 10000000);
        System.out.println(prashant);
        System.out.println("Prashant's PayCheck = ₹" + prashant.collectPay());
        prashant.retire();
        System.out.println("Prashant's Pension check = ₹" + prashant.collectPay());

        HourlyEmployee swapnaja = new HourlyEmployee("Swapnaja", "26/08/1986", "03/03.2021", 67);
        System.out.println(swapnaja);
        System.out.println("Swapnaja's PayCheck = ₹" + swapnaja.collectPay());
        System.out.println("Swapnaja's holiday pay = ₹" + swapnaja.getDoublePay());
    }
}
