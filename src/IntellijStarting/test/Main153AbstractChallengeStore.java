package IntellijStarting.test;

import java.util.ArrayList;

record OrderItem(int qty, ProductForSale153 product) {}

public class Main153AbstractChallengeStore {
    private static ArrayList<ProductForSale153> storeProducts = new ArrayList<>();

    public static void main(String[] args) {
        storeProducts.add(new ArtObject153("Oil Painting", 1350, "Impressionistic work by ABF painted in 2010"));
        storeProducts.add(new ArtObject153("Sculpture", 2000, "Bronze work by JFK, produced in 1950"));
        storeProducts.add(new Furniture154("Desk", 500, "Mahogany desk"));
        storeProducts.add(new Furniture154("Lamp", 200, "Tiffany lamp with Hummingbird"));

        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 3, 5);
        addItemToOrder(order2, 0, 1);
        addItemToOrder(order2, 2, 2);
        printOrder(order2);
    }

    public static void listProducts() {
        for (var item : storeProducts) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty) {
        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order) {
        double salesTotal = 0;
        for (var item : order) {
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Sales Total = ₹%6.2f %n", salesTotal);
    }
}