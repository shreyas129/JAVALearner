package IntellijStarting.test;

import java.util.*;

public class Main222Store {
    private static Random random = new Random();
    private Map<String, InventoryItem222> inventory;
    private NavigableSet<Cart222> carts = new TreeSet<>(Comparator.comparing(Cart222::getId));
    private Map<Category222, Map<String, InventoryItem222>> aisleInventory;

    public static void main(String[] args) {
        Main222Store myStore = new Main222Store();
        myStore.stockStore();
        myStore.listInventory();

        myStore.stockAisles();
        myStore.listProductsByCatagory();

        myStore.manageStoreCarts();
        myStore.listProductsByCatagory(false, true);
    }

    private void manageStoreCarts() {
        Cart222 cart1 = new Cart222(Cart222.CartType222.PHYSICAL, 1);
        carts.add(cart1);

        InventoryItem222 item = aisleInventory.get(Category222.PRODUCE).get("apple");
        cart1.addItem(item, 6);
        cart1.addItem(aisleInventory.get(Category222.PRODUCE).get("pear"), 5);
        cart1.addItem(aisleInventory.get(Category222.BEVERAGE).get("coffee"), 1);
        System.out.println(cart1);
        cart1.removeItem(aisleInventory.get(Category222.PRODUCE).get("pear"), 2);
        System.out.println(cart1);
    }

    private boolean checkOutCart(Cart222 cart) {
        return false;
    }

    private void abandonCarts() {
    }

    private void listProductsByCatagory() {
        listProductsByCatagory(true, false);
    }

    private void listProductsByCatagory(boolean includeHeader, boolean includeDetail) {
        aisleInventory.keySet().forEach(k -> {
            if (includeHeader) System.out.println("--------\n" + k + "\n--------");
            if (!includeDetail) aisleInventory.get(k).keySet().forEach(System.out::println);
            else aisleInventory.get(k).values().forEach(System.out::println);
        });
    }

    private void stockStore() {
        inventory = new HashMap<>();
        List<Product222> products = new ArrayList<>(List.of(
                new Product222("A100", "apple", "local", Category222.PRODUCE),
                new Product222("B100", "banana", "local", Category222.PRODUCE),
                new Product222("P100", "pear", "local", Category222.PRODUCE),
                new Product222("L103", "lemon", "local", Category222.PRODUCE),
                new Product222("M201", "milk", "farm", Category222.DAIRY),
                new Product222("Y001", "yogurt", "farm", Category222.DAIRY),
                new Product222("C333", "cheese", "farm", Category222.DAIRY),
                new Product222("R777", "rice chex", "Nabisco",
                        Category222.CEREAL),
                new Product222("G111", "granola", "Nat Valley",
                        Category222.CEREAL),
                new Product222("BB11", "ground beef", "butcher",
                        Category222.MEAT),
                new Product222("CC11", "chicken", "butcher", Category222.MEAT),
                new Product222("BC11", "bacon", "butcher", Category222.MEAT),
                new Product222("BC77", "coke", "coca cola", Category222.BEVERAGE),
                new Product222("BC88", "coffee", "value", Category222.BEVERAGE),
                new Product222("BC99", "tea", "herbal", Category222.BEVERAGE)
        ));

        products.forEach(p -> inventory.put(p.sku(), new InventoryItem222(p,
                random.nextDouble(0, 1.2), 1000, 5)));
    }

    private void stockAisles() {
        aisleInventory = new EnumMap<>(Category222.class);
        for (InventoryItem222 item : inventory.values()) {
            Category222 aisle = item.getProduct().catagory();
            Map<String, InventoryItem222> productMap = aisleInventory.get(aisle);
            if (productMap == null) {
                productMap = new TreeMap<>();
            }
            productMap.put(item.getProduct().name(), item);
            aisleInventory.putIfAbsent(aisle, productMap);
        }
    }

    private void listInventory() {
        System.out.println("-----------------------------------------");
        inventory.values().forEach(System.out::println);
    }
}
