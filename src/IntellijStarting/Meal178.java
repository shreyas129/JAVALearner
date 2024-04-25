package IntellijStarting;

public class Meal178 {
    private double price=5.0, conversionRate;
    private Item178 burger,drink,side;

    public Meal178() {
        this(1);
    }

    public Meal178(double conversionRate) {
        this.conversionRate = conversionRate;
        burger=new Item178("regular", "burger");
        drink=new Item178("coke", "drink", 1.5);
        System.out.println(drink.name);
        side =new Item178("fries", "side", 2.0);
    }

    public double getTotal(){
        return Item178.getPrice(burger.price+drink.price+side.price, conversionRate);
    }

    @Override
    public String toString() {
        return "%s%n%s%n%s%n%26s₹%.2f".formatted(burger, drink, side, "Total due: ", getTotal());
    }

    private class Item178 {
        private String name, type;
        private double price;

        public Item178(String name, String type) {
            this(name, type, type.equalsIgnoreCase("burger") ? Meal178.this.price : 0);
        }

        public Item178(String name, String type, double price) {
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
