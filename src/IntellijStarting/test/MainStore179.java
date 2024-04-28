package IntellijStarting.test;

public class MainStore179 {
    public static void main(String[] args) {
        Meal179 regularMeal = new Meal179();
        regularMeal.addToppings("Ketchup", "Mayo", "Bacon", "Cheddar");
        System.out.println(regularMeal);

        Meal179 INRegularMeal= new Meal179(0.68);
        System.out.println(INRegularMeal);
    }
}
