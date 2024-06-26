package IntellijStarting;

public class Fish150 extends Animal150{

    public Fish150(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equalsIgnoreCase("slow")) {
            System.out.println(getExplicitType() + " lazily swimming");
        } else {
            System.out.println(getExplicitType() + " darting frantically");
        }
    }

    @Override
    public void makeNoise() {
        if (type.equalsIgnoreCase("Goldfish")) {
            System.out.print("swish ");
        } else {
            System.out.print("splash ");
        }
    }
}
