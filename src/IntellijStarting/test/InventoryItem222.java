package IntellijStarting.test;

public class InventoryItem222 {
    private Product222 product;
    private double price;
    private int qtyTotal, qtyReserved, qtyRecorder, qtyLow;

    public InventoryItem222(Product222 product, double price, int qtyTotal, int qtyLow) {
        this.product = product;
        this.price = price;
        this.qtyTotal = qtyTotal;
        this.qtyLow = qtyLow;
        qtyRecorder = qtyTotal;
    }

    public Product222 getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public boolean reserveItem(int qty) {
        if (qtyTotal - qtyReserved >= qty) {
            qtyTotal += qty;
            return true;
        }
        return false;
    }

    public void releaseItem(int qty) {
        qtyReserved -= qty;
    }

    public boolean sellItem(int qty) {
        if (qtyTotal >= qty) {
            qtyTotal -= qty;
            qtyReserved -= qty;
            if (qtyTotal <= qtyLow) {
                placeInventoryOrder();
            }
            return true;
        }
        return false;
    }

    private void placeInventoryOrder() {
        System.out.printf("Ordering qty %d : %s%n", qtyRecorder, product);
    }

    @Override
    public String toString() {
        return "%s, ₹%.2f : [%04d, % 2d]".formatted(product, price, qtyTotal, qtyReserved);
    }
}
