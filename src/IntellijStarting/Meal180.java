package IntellijStarting;

public class Meal180 {
    private double price=5.0, conversionRate;
    private Item180 burger,drink,side;

    public Meal180() {
        this(1);
    }

    public Meal180(double conversionRate) {
        this.conversionRate = conversionRate;
        burger=new Item180("regular", "burger");
        drink=new Item180("coke", "drink", 1.5);
        System.out.println(drink.name);
        side =new Item180("fries", "side", 2.0);
    }

    public double getTotal(){
        return Item180.getPrice(burger.price+drink.price+side.price, conversionRate);
    }

    @Override
    public String toString() {
        return "%s%n%s%n%s%n%26s₹%.2f".formatted(burger, drink, side, "Total due: ", getTotal());
    }

    private class Item180 {
        private String name, type;
        private double price;

        public Item180(String name, String type) {
            this(name, type, type.equalsIgnoreCase("burger") ? Meal180.this.price : 0);
        }

        public Item180(String name, String type, double price) {
            this.name = name;
            this.type = type;
            this.price = price;
        }

        @Override
        public String toString() {
            return "%10s%15s ₹%.2f".formatted(type,name,getPrice(price, conversionRate));
        }

        private static double getPrice(double price, double rate) {
            return price*rate;
        }
    }
}
