package IntellijStarting.test;

public class Furniture154 extends ProductForSale153{

    public Furniture154(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + " was manufactured in North Carolina");
        System.out.printf("The price of the piece is ₹%6.2f %n", price);
        System.out.println(description);
    }
}
