package IntellijStarting.test;

import java.util.ArrayList;
import java.util.List;

public class Meal179 {
    private double price=5.0, conversionRate;
    private Burger179 burger;
    private Item179 drink, side;

    public Meal179() {
        this(1);
    }

    public Meal179(double conversionRate) {
        this.conversionRate = conversionRate;
        burger=new Burger179("regular");
        drink=new Item179("coke", "drink", 1.5);
        System.out.println(drink.name);
        side =new Item179("fries", "side", 2.0);
    }

    public double getTotal(){
        return Item179.getPrice(burger.getPrice()+drink.price+side.price, conversionRate);
    }

    @Override
    public String toString() {
        return "%s%n%s%n%s%n%26s₹%.2f".formatted(burger, drink, side, "Total due: ", getTotal());
    }

    public void addToppings(String... selectedToppings){
        burger.addToppings(selectedToppings);
    }

    private class Item179 {
        private String name, type;
        private double price;

        public Item179(String name, String type) {
            this(name, type, type.equalsIgnoreCase("burger") ? Meal179.this.price : 0);
        }

        public Item179(String name, String type, double price) {
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


    private class Burger179 extends Item179{

        private enum Extra{AVOCADO, BACON, CHEESE, KETCHUP, MAYO, MUSTARD, PICKLES;
            private double getPrice(){
                return switch (this){
                    case AVOCADO -> 1.0;
                    case BACON, CHEESE -> 1.5;

                    default -> 0;
                };
            }
        }

        private List<Item179> toppings = new ArrayList<>();

        Burger179(String name) {
            super(name, "Burger", 5.0);
        }

        public double getPrice(){
            double total= super.price;
            for(Item179 topping:toppings){
                total+= topping.price;
            }
            return total;
        }

        private void addToppings(String... selectedToppings){
            for(String selectedTopping:selectedToppings){
                try {
                    Extra topping =Extra.valueOf(selectedTopping.toUpperCase());
                    toppings.add(new Item179(topping.name(), "TOPPING", topping.getPrice()));
                } catch (IllegalArgumentException ie){
                    System.out.println("No topping found for "+selectedTopping);
                }
            }
        }

        @Override
        public String toString() {
            StringBuilder itemized=new StringBuilder(super.toString());
            for(Item179 topping:toppings){
                itemized.append("\n");
                itemized.append(topping);
            }
            return itemized.toString();
        }
    }
}
