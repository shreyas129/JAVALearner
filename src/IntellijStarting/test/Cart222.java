package IntellijStarting.test;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Cart222 {
    enum CartType222 {PHYSICAL, VIRTUAL}

    private static int lastId = 1;
    private int id;
    private LocalDate cartDate;
    private CartType222 type;
    private Map<String, Integer> products;

    public Cart222(CartType222 type, int days) {
        this.type = type;
        id = lastId++;
        cartDate = LocalDate.now().minusDays(days);
        products = new HashMap<>();
    }

    public Cart222(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public LocalDate getCartDate() {
        return cartDate;
    }

    public void addItem(InventoryItem222 item, int qty) {
        products.merge(item.getProduct().sku(), qty, Integer::sum);

        if (!item.reserveItem(qty)) {
            System.out.println("Ouch, something went wrong, could not add item");
        }
    }

    public void removeItem(InventoryItem222 item, int qty) {
        int current = products.get(item.getProduct().sku());
        if (current <= qty) {
            qty = current;
            products.remove(item.getProduct().sku());
            System.out.printf("Item [%s] removed from basket%n", item.getProduct().name());
        } else {
            products.merge(item.getProduct().sku(), qty, (oldVal, newVal) -> oldVal - newVal);
            System.out.printf("%d [%s]s removed%n", qty, item.getProduct().name());
        }
        item.releaseItem(qty);
    }

    public void printSalesSlip(Map<String, InventoryItem222> inventory) {
        double total = 0;

        System.out.println("---------------------------------------");

        System.out.println("Thank you for your sale: ");
        for (var cartItem : products.entrySet()) {
            var item = inventory.get(cartItem.getKey());
            int qty = cartItem.getValue();
            double itemizedPrice = (item.getPrice() * qty);
            total += itemizedPrice;
            System.out.printf("\t%s %-10s (%d)@ ₹%.2f = ₹%.2f%n", cartItem.getKey(), item.getProduct().name(), qty, itemizedPrice);
        }
        System.out.printf("Total Sale: ₹%.2f%n", total);

        System.out.println("----------------------------------------");
    }

    @Override
    public String toString() {
        return "Cart222{" +
                "products=" + products +
                ", id=" + id +
                ", cartDate=" + cartDate +
                '}';
    }
}
