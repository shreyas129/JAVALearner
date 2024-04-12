package IntellijStarting.test;

public class ArtObject153 extends ProductForSale153{

    public ArtObject153(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + " is a beatiful reprodution");
        System.out.printf("The price of the piece is ₹%6.2f %n", price);
        System.out.println(description);
    }
}
