package IntellijStarting;

abstract class Mammal extends Animal150 {

    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.print(getExplicitType() + " ");
        System.out.println(speed.equalsIgnoreCase("slow") ? " walks" : " runs");
    }

    public abstract void shedHair();
}

public abstract class Animal150 {
    protected String type;
    private String size;
    private double weight;

    public Animal150(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String speed);
    public abstract void makeNoise();

    public final String getExplicitType() {
        return getClass().getSimpleName() + "(" + type + ")";
    }
}
